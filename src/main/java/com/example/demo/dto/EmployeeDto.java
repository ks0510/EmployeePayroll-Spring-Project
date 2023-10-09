package com.example.demo.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EmployeeDto {

	String name;
	String gender;
	String department;
	int salary;
	LocalDate date;
}
