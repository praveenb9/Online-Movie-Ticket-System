package com.capg.omts.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.login.model.AuthenticationResponse;
import com.capg.omts.login.model.User;
import com.capg.omts.login.model.UserCredentials;
import com.capg.omts.login.service.ILoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@PostMapping("/user/authentication")
	public AuthenticationResponse getUser(UserCredentials credentials)
	{
		UserCredentials userCredentials= loginService.authenticate(credentials);
		return loginService.getToken(userCredentials);
	}
}
