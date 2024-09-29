package com.utkarsh01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class EmployeeDetails {
	private Integer empId;
	private String name;
	private String dept;
	private double salary;
	
	public EmployeeDetails(String name,String dept,double salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
}
