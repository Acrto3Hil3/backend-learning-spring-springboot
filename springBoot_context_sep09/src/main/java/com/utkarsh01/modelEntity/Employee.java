package com.utkarsh01.modelEntity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Component("emp1")
@Data @AllArgsConstructor  @NoArgsConstructor
public class Employee {
	private Integer id;
	private String name;
	private String address;
	private String dept;
	private Double salary;
	
	public Employee(String name, String address, String dept, Double salary) {
		super();
		this.name = name;
		this.address = address;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	
}
