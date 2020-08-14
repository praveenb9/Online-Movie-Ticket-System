package com.capg.omts.user.service;

import com.capg.omts.user.model.Admin;
import com.capg.omts.user.model.Customer;
import com.capg.omts.user.model.User;

public interface IUserService {

	public Admin addAdmin(Admin admin);
	public User getUserByUserIdAndPassword(int userId,String password);
	public Customer addCustomer(Customer customer);
}
