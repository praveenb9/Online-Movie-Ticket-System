package com.capg.omts.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.user.model.Admin;
import com.capg.omts.user.model.Customer;
import com.capg.omts.user.model.User;
import com.capg.omts.user.model.UserCredentials;
import com.capg.omts.user.repo.UserRepo;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public Admin addAdmin(Admin admin) {
admin.setUserId(admin.getAdminId());
admin.setUserName(admin.getAdminName());
admin.setPassword(admin.getAdminPassword());
		return userRepo.save(admin);
	}

	@Override
	public UserCredentials getUserByUserIdAndPassword(int userId, String password) {
		// TODO Auto-generated method stub
		User user= userRepo.findByUserIdAndPassword(userId, password);
		String id=String.valueOf(user.getUserId());
		if(id.length()==4 && id.charAt(0)=='1')
		{
			return new UserCredentials(user.getUserId(), user.getPassword(), "admin");
		}
		else
		{
			return new UserCredentials(user.getUserId(),user.getPassword(), "customer");
		}
	}

	@Override
	public Customer addCustomer(Customer customer) {
		customer.setUserId(customer.getCustomerId());
		customer.setUserName(customer.getCustomerName());
		customer.setPassword(customer.getCustomerPassword());
		return userRepo.save(customer);
	}

}
