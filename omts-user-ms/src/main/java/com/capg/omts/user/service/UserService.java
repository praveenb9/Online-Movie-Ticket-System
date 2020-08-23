package com.capg.omts.user.service;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.omts.user.exception.InvalidContactException;
import com.capg.omts.user.exception.InvalidDateOfBirthException;
import com.capg.omts.user.exception.InvalidNameException;
import com.capg.omts.user.exception.InvalidPasswordException;
import com.capg.omts.user.exception.InvalidUserException;
import com.capg.omts.user.model.Admin;
import com.capg.omts.user.model.Customer;
import com.capg.omts.user.model.User;
import com.capg.omts.user.model.UserCredentials;
import com.capg.omts.user.repo.UserRepo;

@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public Admin addAdmin(Admin admin) {
		
		if(admin.getAdminName()==null)
		{
			throw new InvalidNameException("Admin Name Should not be null");
		}

		if (admin.getAdminPassword().length() < 8) {
			throw new InvalidPasswordException("Password must be min 8 characters");
		}

		if (admin.getAdminContact().length() != 10) {
			throw new InvalidContactException("Contact must be of 10 charcaters");
		}

		if (admin.getDateOfBirth() == null || admin.getDateOfBirth().isAfter(LocalDate.now())) {

			throw new InvalidDateOfBirthException("Date Of Birth should be Before Present Date");
		}
		admin.setUserId(admin.getAdminId());
		admin.setUserName(admin.getAdminName());
		admin.setPassword(admin.getAdminPassword());
		return userRepo.save(admin);
	}

	@Override
	public UserCredentials getUserByUserIdAndPassword(int userId, String password) // throws InvalidUserException
	{
		System.out.println(userId + password);

		if (userRepo.existsById(userId)) {
			User user = userRepo.getOne(userId);

			if (!user.getPassword().equals(password)) {
				throw new InvalidPasswordException("Invalid Password");
			}
		}

		if (!userRepo.existsById(userId)) {
			throw new InvalidUserException("User with Id " + userId + " Does Not Exitst");
		}
		User user = userRepo.findByUserIdAndPassword(userId, password);
		String id = String.valueOf(user.getUserId());
		if (id.length() == 4 && id.charAt(0) == '1') {
			return new UserCredentials(user.getUserId(), user.getPassword(), "admin");
		} else {
			return new UserCredentials(user.getUserId(), user.getPassword(), "customer");
		}
	}

	@Override
	public Customer addCustomer(Customer customer) {

		if(customer.getCustomerName() == null)
		{
			throw new InvalidNameException("Customer Name Should not be null");
		}
		if (customer.getCustomerPassword().length() < 8) {
			throw new InvalidPasswordException("Password must be min 8 characters");
		}

		if (customer.getCustomerContact().length() != 10) {
			throw new InvalidContactException("Contact must be of 10 charcaters");
		}
		if (customer.getDateOfBirth() == null || customer.getDateOfBirth().isAfter(LocalDate.now())) {

			throw new InvalidDateOfBirthException("Date Of Birth should be Before Present Date");
		}
		customer.setUserId(customer.getCustomerId());
		customer.setUserName(customer.getCustomerName());
		customer.setPassword(customer.getCustomerPassword());
		
		return userRepo.save(customer);
	}

}
