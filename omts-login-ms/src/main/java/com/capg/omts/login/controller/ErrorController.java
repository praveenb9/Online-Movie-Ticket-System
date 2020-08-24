/**
 	* Project Name : Online Movie Ticket System
 	*
 	* 
**/

package com.capg.omts.login.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpStatusCodeException;
import com.capg.omts.login.model.ErrorResponse;

/**
	* The ErrorController class controls  the Exceptions Raised.
	*
	* @author   :Praveen Bandi
	* @version  :1.0
	* @since    :2020-07-22 
**/
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
