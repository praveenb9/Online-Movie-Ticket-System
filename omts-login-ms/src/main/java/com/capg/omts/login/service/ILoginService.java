package com.capg.omts.login.service;


import com.capg.omts.login.model.AuthenticationResponse;
import com.capg.omts.login.model.UserCredentials;

public interface ILoginService {

	public UserCredentials authenticate(UserCredentials credentials);
	public AuthenticationResponse getToken(UserCredentials credentials);
}
