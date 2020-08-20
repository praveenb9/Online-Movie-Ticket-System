package com.capg.omts.user.service;

//import com.capg.omts.user.exception.InvalidUserException;
import com.capg.omts.user.model.Admin;
import com.capg.omts.user.model.Customer;
//import com.capg.omts.user.model.User;
import com.capg.omts.user.model.UserCredentials;

public interface IUserService {

	public Admin addAdmin(Admin admin);
	public UserCredentials getUserByUserIdAndPassword(int userId,String password);
	public Customer addCustomer(Customer customer);
}
