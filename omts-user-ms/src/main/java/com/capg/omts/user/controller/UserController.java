package com.capg.omts.user.controller;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.user.model.Admin;
import com.capg.omts.user.model.Customer;
import com.capg.omts.user.model.User;
import com.capg.omts.user.model.UserCredentials;
import com.capg.omts.user.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	Random random = new Random();

	@PostMapping("/adminRegister")
	public Admin registerAsAdmin(@RequestBody Admin admin)
	{
		 admin.setAdminId( random.nextInt(1000)+1000);

		return userService.addAdmin(admin);
	}
	
	@PostMapping("/customerRegister")
	public Customer registerAsCustomer(@RequestBody Customer customer)
	{
customer.setCustomerId(random.nextInt(1000000));
		return userService.addCustomer(customer);
	}

	@PostMapping("/authenticate")
	public User getUserInfo(@RequestBody UserCredentials credentials)
	{
		return userService.getUserByUserIdAndPassword(credentials.getUserId(), credentials.getPassword());
		
	}
}
