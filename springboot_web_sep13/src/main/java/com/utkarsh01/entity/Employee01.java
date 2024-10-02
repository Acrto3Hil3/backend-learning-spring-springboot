package com.utkarsh01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor
public class Employee01 {
	private Integer eId;
	private String eName;
	private String eAddress;
	private Double eSalary;
	
	public Employee01(String eName, String eAddress, Double eSalary) {
		super();
		this.eName = eName;
		this.eAddress = eAddress;
		this.eSalary = eSalary;
	}	
}
