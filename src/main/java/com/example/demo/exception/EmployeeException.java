package com.example.demo.exception;

import lombok.Data;

@Data
public class EmployeeException  extends RuntimeException{
	
	String message;

	public EmployeeException(String message) {
		super(message);
		this.message = message;
	}
	

}
