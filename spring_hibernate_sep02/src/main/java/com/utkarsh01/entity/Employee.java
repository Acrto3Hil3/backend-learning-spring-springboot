package com.utkarsh01.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data @AllArgsConstructor @NoArgsConstructor
public class Employee {
	private Integer id;
 

	private String name;
	
	
	private String address;

	private Double salary;
	
	public Employee(String name, String address, Double salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	
}
