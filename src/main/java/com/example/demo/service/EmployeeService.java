package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.Employee;
import com.example.demo.Response;
import com.example.demo.Response2;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.exception.EmployeeException;
import com.example.demo.repository.IEmployeeRepo;


@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	ModelMapper mapper;

	@Autowired
	Response response;

	@Autowired
	IEmployeeRepo repo2;
	
	@Autowired
	Response2 response2;

	@Override
	public ResponseEntity<Response> add(EmployeeDto employee) {
		Employee employee1 = mapper.map(employee, Employee.class);
		repo2.save(employee1);
		response.setMessage("Employee added successfully");
		response.setObject(employee1);
		return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<Response> getEmployeeById(int id) {
		Employee employee = repo2.findById(id).orElse(null);
		if (employee != null) {
			EmployeeDto employee1 = mapper.map(employee, EmployeeDto.class);
			response.setMessage("Student found by student Id");
			response.setObject(employee);
			return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
		} else {
			throw new EmployeeException("Entered Student id is wrong");
		}
	}

	@Override
	public ResponseEntity<Response> update(Employee employee, int employeeId) {

		Employee updateEmployee = repo2.findById(employeeId).orElse(null);
		if (updateEmployee != null) {
			employee.setEmployeeId(employeeId);
			repo2.save(employee);
			EmployeeDto employee1 = mapper.map(employee, EmployeeDto.class);
			response.setMessage("Employee Updated Succesfully");
			response.setObject(employee1);
			return new ResponseEntity<>(response, HttpStatus.ALREADY_REPORTED);
		}

		else {
			throw new EmployeeException("Entered employee Id is wrong");
		}
	}

	@Override
	public void delete(int id) {
		repo2.deleteById(id);
		
	}

	@Override
	public ResponseEntity<Response2> getAllDetails() {
		response2.setMessage("All Employee Detils");
		response2.setList(repo2.findAll());
		return new ResponseEntity<>(response2, HttpStatus.ALREADY_REPORTED);
		
	}

}
