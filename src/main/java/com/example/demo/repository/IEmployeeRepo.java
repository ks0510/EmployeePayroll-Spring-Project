package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Employee;


public interface IEmployeeRepo extends JpaRepository<Employee,Integer>{
	
	public void deleteById(int id);
	

	
}
