package com.capg.omts.login.service;

import com.capg.omts.login.exception.InvalidUserException;
import com.capg.omts.login.model.Admin;
import com.capg.omts.login.model.AuthenticationResponse;
import com.capg.omts.login.model.Customer;
import com.capg.omts.login.model.User;
import com.capg.omts.login.model.UserCredentials;

public interface ILoginService {

//	public Customer getCustomer(User user);
//	public Admin getAdmin(User user);
	public User getUser();
	public UserCredentials authenticate(UserCredentials credentials) throws InvalidUserException;
	public AuthenticationResponse getToken(UserCredentials credentials);
}
