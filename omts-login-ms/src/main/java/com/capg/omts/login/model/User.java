package com.capg.omts.login.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class User {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String password;
	
public User() {
	// TODO Auto-generated constructor stub
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}
