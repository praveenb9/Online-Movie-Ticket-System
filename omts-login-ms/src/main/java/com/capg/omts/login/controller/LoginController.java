package com.capg.omts.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.capg.omts.login.exception.InvalidUserException;
import com.capg.omts.login.model.AuthenticationResponse;
import com.capg.omts.login.model.UserCredentials;
import com.capg.omts.login.service.ILoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

	@Autowired
	private ILoginService loginService;

	@PostMapping("/public/authenticate")
	public AuthenticationResponse getUser(@RequestBody UserCredentials credentials) {
		UserCredentials userCredentials = loginService.authenticate(credentials);
		return loginService.getToken(userCredentials);

	}
}
