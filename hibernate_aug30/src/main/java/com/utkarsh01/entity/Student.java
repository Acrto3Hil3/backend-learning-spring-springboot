package com.utkarsh01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor

public class Student {
	
	private Long id;

	private String name;
	
	private String address;
	
	private Double salary;
	
	public Student(String name, String address, Double salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
}
