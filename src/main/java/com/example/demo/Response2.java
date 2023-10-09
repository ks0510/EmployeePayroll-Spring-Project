package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Response2 {
	
	String message;
	List<Employee> list;

}
