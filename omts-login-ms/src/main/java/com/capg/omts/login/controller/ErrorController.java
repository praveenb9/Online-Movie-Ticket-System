package com.capg.omts.login.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.omts.login.exception.InvalidUserException;
import com.capg.omts.login.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {

	@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(value = {InvalidUserException.class})
	public ErrorResponse handleStudentAlreadyExistsException(Exception ex, HttpServletRequest req)
	{
		return new ErrorResponse(new Date(), ex.getMessage(), 
	
				HttpStatus.UNAUTHORIZED.getReasonPhrase(), HttpStatus.UNAUTHORIZED.value(), req.getRequestURI());
	}
	
}
