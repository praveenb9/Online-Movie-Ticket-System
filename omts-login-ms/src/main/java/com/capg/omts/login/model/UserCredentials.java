package com.capg.omts.login.model;

public class UserCredentials {

	private int userId;
	private String password;
	public UserCredentials() {
		// TODO Auto-generated constructor stub
	}
	public UserCredentials(int userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public int getuserId() {
		return userId;
	}
	public void setuserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserCredentials [userId=" + userId + ", password=" + password + "]";
	}
	
	
}
