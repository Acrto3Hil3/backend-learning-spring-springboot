package com.utkarsh01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.utkarsh01.modelEntity.Employee;

@Configuration
public class AppConfig {
	
	@Bean("emp2")
	public Employee empDetails() {
		Employee e=new Employee();
		e.setName("Utkarsh");
		e.setAddress("Delhi");
		e.setDept("SDE");
		e.setSalary(65000d);
		System.out.println("hi config file");
		return e;
		
	}
}
