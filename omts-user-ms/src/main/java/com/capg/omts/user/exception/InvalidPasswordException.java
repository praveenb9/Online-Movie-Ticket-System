package com.capg.omts.user.exception;

public class InvalidPasswordException extends RuntimeException{
	
	public InvalidPasswordException(String message) {
		super(message);
	}

}
