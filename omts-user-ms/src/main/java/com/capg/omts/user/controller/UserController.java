package com.capg.omts.user.controller;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.user.exception.InvalidUserException;
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
	
	@Autowired
	Random random;

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
	//@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public UserCredentials getUserInfo(@RequestBody UserCredentials credentials) throws InvalidUserException
	{
		return userService.getUserByUserIdAndPassword(credentials.getUserId(), credentials.getPassword());

	}
}
