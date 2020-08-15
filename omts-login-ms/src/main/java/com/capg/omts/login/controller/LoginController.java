package com.capg.omts.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.omts.login.model.AuthenticationResponse;
import com.capg.omts.login.model.UserCredentials;
import com.capg.omts.login.service.ILoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@PostMapping("/user/authentication")
	public AuthenticationResponse getUser(@RequestBody UserCredentials credentials)
	{
		UserCredentials userCredentials= loginService.authenticate(credentials);
		System.out.println(userCredentials);
		return loginService.getToken(userCredentials);
	}
}
