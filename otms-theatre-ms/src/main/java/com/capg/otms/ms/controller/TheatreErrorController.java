package com.capg.otms.ms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otms.ms.exception.InvalidInputException;
import com.capg.otms.ms.exception.TheatreAlreadyExistsException;
import com.capg.otms.ms.exception.TheatreException;



@ControllerAdvice
@RestController
public class TheatreErrorController {
	@ExceptionHandler(InvalidInputException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid Input")
	public void handleInvalidInputException(){
		
	}
	@ExceptionHandler(TheatreAlreadyExistsException.class)
	@ResponseStatus(value= HttpStatus.NOT_ACCEPTABLE,reason = "Resource already exists")
	public void handleUserAlredyExistsException (){
		
	}
	@ExceptionHandler(TheatreException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "Resource not found")
	public  void handleTheatreNotFoundException() {
		
	}
}