/**
 	* Project Name : Online Movie Ticket System
 	 
**/

package com.capg.omts.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.capg.omts.login.model.AuthenticationResponse;
import com.capg.omts.login.model.User;
import com.capg.omts.login.model.UserCredentials;
import com.capg.omts.login.util.TokenUtil;

/**
	* The LoginService class does the business logics related to Login
	*
	* @author   :Praveen Bandi
	* @version  :1.0
	* @since    :2020-08-24 
**/

@Service
public class LoginService implements ILoginService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private TokenUtil tokenUtil;

	/**
	   * This method is used to Verify Whether The User with The given Credentials is Exists or not. 
	   * 
	   * @return UserCredentials : This returns the credentials of the user.
	**/ 

	public UserCredentials authenticate(UserCredentials credentials) {
		System.out.println(credentials);
		return restTemplate.postForObject("http://localhost:8100/users/public/authenticate", credentials,
				UserCredentials.class);

	}

	/**
	   * This method is used to generate the token for the  given Credentials. 
	   * 
	   * @return AuthenicationResponse : This returns the Token.
	**/ 
	public AuthenticationResponse getToken(UserCredentials credentials) {
		String generatedToken = tokenUtil.generateToken(credentials);
		AuthenticationResponse authentication = new AuthenticationResponse();
		authentication.setToken(generatedToken);

		return authentication;
	}

	@Override
	public UserCredentials getUser(User user) {
		return restTemplate.postForObject("http://localhost:8100/users/public/authenticate", user,
				UserCredentials.class);	}
}
