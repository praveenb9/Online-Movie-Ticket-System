package com.capg.omts.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.omts.login.model.AuthenticationResponse;
import com.capg.omts.login.model.User;
import com.capg.omts.login.model.UserCredentials;
import com.capg.omts.login.util.TokenUtil;

@Service
public class LoginService implements ILoginService{

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	TokenUtil tokenUtil;

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public Customer getCustomer(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Admin getAdmin(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

	public User authenticate(UserCredentials credentials)
	{
		User user=restTemplate.postForObject("http://localhost:8300/users/authenticate", credentials, User.class);
		return user;
	}
	
	public AuthenticationResponse getToken(User user)
	{
		String generatedToken =tokenUtil.generateToken(new UserCredentials(user.getUserId(),user.getPassword()));
		AuthenticationResponse auth=new AuthenticationResponse();
		auth.setToken(generatedToken);
		return auth;
	}
}
