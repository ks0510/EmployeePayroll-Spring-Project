package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Employee;
import com.example.demo.Response;
import com.example.demo.Response2;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<Response> addEmployee(@RequestBody EmployeeDto employee) {
		return employeeService.add(employee);
	}
	
	@PutMapping("/updateEmployee/{employeeId}")
	public ResponseEntity<Response> updateDeatils(@RequestBody Employee employee, @PathVariable int employeeId)  {

		return employeeService.update(employee,employeeId);
	}
	
	@DeleteMapping("/deleteEmployee")
	public String deleteDataById(@RequestParam int id) {

		employeeService.delete(id);
		return "Employee deleted successfully";
	}
	
	@GetMapping("/showEmployees")
	public ResponseEntity<Response2> fetchDetails(){
		return employeeService.getAllDetails();
	}

	

}
