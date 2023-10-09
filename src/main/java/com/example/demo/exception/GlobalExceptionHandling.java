package com.example.demo.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Response;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandling {
	
	@Autowired
	Response response;
	
	@ExceptionHandler(value=EmployeeException.class)
	public Response findException(EmployeeException employeeException) {
		
		response.setMessage(employeeException.getMessage());
		return response;
		
		
	}

}
