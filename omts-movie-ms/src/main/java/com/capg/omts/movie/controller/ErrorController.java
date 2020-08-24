package com.capg.omts.movie.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.omts.movie.Exception.MovieException;
import com.capg.omts.movie.model.ErrorResponse;



@RestControllerAdvice
public class ErrorController {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {MovieException.class})
	public ErrorResponse handleInvalidPasswordException(MovieException exception, HttpServletRequest request)
	{
		return new ErrorResponse(new Date(), exception.getMessage(), 
	
				HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.value(), request.getRequestURI());
	}
	
	
}
