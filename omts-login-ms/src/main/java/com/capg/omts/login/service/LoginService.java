package com.capg.omts.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.capg.omts.login.model.AuthenticationResponse;
import com.capg.omts.login.model.User;
import com.capg.omts.login.model.UserCredentials;
import com.capg.omts.login.util.TokenUtil;
import com.capg.omts.login.exception.InvalidUserException;


@Service
public class LoginService implements ILoginService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private TokenUtil tokenUtil;

	@Override
	public User getUser() {
		
		return null;
	}
	
	public UserCredentials authenticate(UserCredentials credentials)
	{			
		System.out.println(credentials);
		return restTemplate.postForObject("http://localhost:8100/users/public/authenticate", credentials, UserCredentials.class);
	
		}

	
	public AuthenticationResponse getToken(UserCredentials credentials)
	{
		String generatedToken =tokenUtil.generateToken(credentials);
		AuthenticationResponse authentication=new AuthenticationResponse();
		authentication.setToken(generatedToken);
		
//		UserCredentials cred=tokenUtil.decode(generatedToken);
//		System.out.println(cred);
		return authentication;
	}
}
