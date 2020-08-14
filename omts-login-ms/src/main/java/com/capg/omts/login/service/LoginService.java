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
	private RestTemplate restTemplate;
	
	@Autowired
	private TokenUtil tokenUtil;

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
	

	public UserCredentials authenticate(UserCredentials credentials)
	{
		return  restTemplate.postForObject("http://localhost:8100/users/authenticate", credentials, UserCredentials.class);
		
	}
	
	public AuthenticationResponse getToken(UserCredentials credentials)
	{
		String generatedToken =tokenUtil.generateToken(credentials);
		AuthenticationResponse authentication=new AuthenticationResponse();
		authentication.setToken(generatedToken);
		return authentication;
	}
}
