package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.Employee;
import com.example.demo.Response;
import com.example.demo.Response2;
import com.example.demo.dto.EmployeeDto;


public interface IEmployeeService {
	
	public ResponseEntity<Response> add(EmployeeDto employee);
	
	public ResponseEntity<Response> getEmployeeById(int id);
	
	public ResponseEntity<Response> update(Employee employee, int employeeId);
	
	public void delete(int id);
	
	public ResponseEntity<Response2> getAllDetails();

}
