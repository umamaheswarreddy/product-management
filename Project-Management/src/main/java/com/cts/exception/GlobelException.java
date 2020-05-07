package com.cts.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobelException  extends Exception{

	
	private static final long serialVersionUID = 1L;
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> customValidationErrorhandling(MethodArgumentNotValidException exception)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(),"Validation Error", exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<>(errorDetails,HttpStatus.BAD_REQUEST);
		
	}
	

}
