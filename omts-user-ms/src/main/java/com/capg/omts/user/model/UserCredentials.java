package com.capg.omts.user.model;

public class UserCredentials {

	private int userId;
	private String password;
	private String userType;
	public UserCredentials() {
		// TODO Auto-generated constructor stub
	}
	public UserCredentials(int userId, String password,String userType) {
		super();
		this.userId = userId;
		this.password = password;
		this.userType=userType;
	}
	
	public UserCredentials(int userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "UserCredentials [userId=" + userId + ", password=" + password + ", userType=" + userType + "]";
	}
	
	
}
