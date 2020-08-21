package com.capg.omts.user.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.omts.user.exception.InvalidContactException;
import com.capg.omts.user.exception.InvalidDateOfBirthException;
import com.capg.omts.user.exception.InvalidNameException;
import com.capg.omts.user.exception.InvalidPasswordException;
import com.capg.omts.user.exception.InvalidUserException;
import com.capg.omts.user.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {InvalidPasswordException.class})
	public ErrorResponse handleInvalidPasswordException(InvalidPasswordException exception, HttpServletRequest request)
	{
		return new ErrorResponse(new Date(), exception.getMessage(), 
	
				HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), request.getRequestURI());
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = {InvalidUserException.class})
	public ErrorResponse handleInvalidUserException(InvalidUserException exception, HttpServletRequest request)
	{
		return new ErrorResponse(new Date(), exception.getMessage(), 
	
				HttpStatus.NOT_FOUND.getReasonPhrase(), HttpStatus.NOT_FOUND.value(), request.getRequestURI());
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {InvalidContactException.class})
	public ErrorResponse handleIInvalidContactException(InvalidContactException exception, HttpServletRequest request)
	{
		return new ErrorResponse(new Date(), exception.getMessage(), 
	
				HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), request.getRequestURI());
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {InvalidDateOfBirthException.class})
	public ErrorResponse handleInvalidDateOfBirthException(InvalidDateOfBirthException exception, HttpServletRequest request)
	{
		return new ErrorResponse(new Date(), exception.getMessage(), 
	
				HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), request.getRequestURI());
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {InvalidNameException.class})
	public ErrorResponse handleInvalidNameException(InvalidNameException exception, HttpServletRequest request)
	{
		return new ErrorResponse(new Date(), exception.getMessage(), 
	
				HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), request.getRequestURI());
	}
}
