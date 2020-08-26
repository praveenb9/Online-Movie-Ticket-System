/**
 	* Project Name : Online Movie Ticket System
 	*
 	* 
**/
package com.capg.omts.login.util;

import org.springframework.stereotype.Component;

import com.capg.omts.login.model.UserCredentials;


@Component
public class TokenUtil {

	public String generateToken(UserCredentials credentials)
	{
		System.err.println(credentials);
		StringBuilder userIdSB=new StringBuilder(credentials.getUserId()+"");
		StringBuilder passwordSB=new StringBuilder(credentials.getPassword());
		String encoded=userIdSB.reverse()+","+passwordSB.reverse();
		return encoded;
	}

	public UserCredentials decode(String token) {
		String []cred=token.split(",");
		StringBuilder userIdSB=new StringBuilder(cred[0]);
		StringBuilder passwordSB=new StringBuilder(cred[1]);
		String userId=userIdSB.reverse().toString();
		return new UserCredentials(Integer.parseInt(userId),passwordSB.reverse().toString());
		
	}
}
