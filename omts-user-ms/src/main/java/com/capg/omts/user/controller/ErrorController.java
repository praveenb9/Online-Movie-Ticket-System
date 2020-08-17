package com.capg.omts.user.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.omts.user.exception.InvalidUserException;
import com.capg.omts.user.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {InvalidUserException.class})
	public ErrorResponse handleStudentAlreadyExistsException(Exception ex, HttpServletRequest req)
	{
		return new ErrorResponse(new Date(), ex.getMessage(), 
	
				HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_GATEWAY.value(), req.getRequestURI());
	}
	
}
