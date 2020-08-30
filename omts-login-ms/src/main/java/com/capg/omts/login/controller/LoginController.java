/**
 	* Project Name : Online Movie Ticket System
 	*
 	* 
**/

package com.capg.omts.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.omts.login.model.AuthenticationResponse;
import com.capg.omts.login.model.User;
import com.capg.omts.login.model.UserCredentials;
import com.capg.omts.login.service.ILoginService;

/**
 	* The LoginController class Do the Authentication of A User
 	*
 	* @author   :Praveen Bandi
 	* @version  :1.0
 	* @since    :2020-08-24 
**/

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

	// Tells the application context to inject an instance of ILoginService here
	@Autowired
	private ILoginService loginService;

	
	/**
	   * This method is used to Verify Whether The User with The given Credentials is Exists or not and Generates a token is user Exists. 
	   * 
	   * @return AuthenicationResponse : This returns the Token.
	**/   
	
	@PostMapping("/public/authenticate")
	public AuthenticationResponse getUser(@RequestBody UserCredentials credentials) {
		UserCredentials userCredentials = loginService.authenticate(credentials);
		return loginService.getToken(userCredentials);

	}
	
	/**
	   * This method is used to get The User with The given Credentials . 
	   * 
	   * @return UserCredentials : This returns credentials of the user.
	**/   
	@PostMapping("/public/getUser")
	public UserCredentials getCredentials(@RequestBody User credentials)
	{
		return loginService.getUser(credentials);
	}
}
