package com.capg.omts.login.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpClientErrorException.NotFound;
import org.springframework.web.client.HttpStatusCodeException;

import com.capg.omts.login.exception.InvalidUserException;
import com.capg.omts.login.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {

//	@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
//	@ExceptionHandler(value = {InvalidUserException.class})
//	public ErrorResponse handleInvalidUserException(Exception ex, HttpServletRequest req)
//	{
//		return new ErrorResponse(new Date(), ex.getMessage(), 
//	
//				HttpStatus.UNAUTHORIZED.getReasonPhrase(), HttpStatus.UNAUTHORIZED.value(), req.getRequestURI());
//	}
	
	//@ResponseStatus(code = HttpStatus.NOT_FOUND)
	
	@ExceptionHandler(value = {HttpStatusCodeException.class})
	public ResponseEntity<ErrorResponse> handleNotFound(HttpStatusCodeException excepion, HttpServletRequest request)
	{
		ErrorResponse response=new ErrorResponse(new Date(), excepion.getMessage(),
				excepion.getStatusCode().getReasonPhrase(), 
				excepion.getStatusCode().value(), request.getRequestURI());
		
		return new ResponseEntity<ErrorResponse>(response,excepion.getStatusCode());
	}
	
}
