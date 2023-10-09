
package com.example.demo;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int employeeId;
	String name;
	String gender;
	String department;
	int salary;
	LocalDate date;

}
