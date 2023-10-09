package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeePayrollApplication {
	
	@Bean
	public ModelMapper getModelMapper() {
	return new ModelMapper();
	 }


	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollApplication.class, args);
	}

}
