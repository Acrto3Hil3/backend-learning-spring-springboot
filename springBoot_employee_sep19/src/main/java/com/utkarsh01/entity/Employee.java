package com.utkarsh01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor 

public class Employee {
	private Integer id;
	private String name;
	private String position;
	private Double salary;
	
	public Employee(String name, String position, Double salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
}
