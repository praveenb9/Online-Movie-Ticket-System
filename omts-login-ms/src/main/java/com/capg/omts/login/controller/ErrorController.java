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

import com.capg.omts.login.exception.InvalidPasswordException;
import com.capg.omts.login.exception.InvalidUserException;
import com.capg.omts.login.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(value = {HttpStatusCodeException.class})
	public ResponseEntity<ErrorResponse> handleNotFound(HttpStatusCodeException excepion, HttpServletRequest request)
	{
		ErrorResponse response=new ErrorResponse(new Date(), excepion.getMessage(),
				excepion.getStatusCode().getReasonPhrase(), 
				excepion.getStatusCode().value(), request.getRequestURI());
		
		return new ResponseEntity<ErrorResponse>(response,excepion.getStatusCode());
	}
	
}
