package com.utkarsh01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails {
	private Integer empId;
	private String name;
	private String dept;
	private double salary;
	public EmployeeDetails(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
}
