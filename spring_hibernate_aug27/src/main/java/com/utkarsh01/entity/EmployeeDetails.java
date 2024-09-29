package com.utkarsh01.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetails{
	
	private Integer empId;
	
	@NotEmpty @Size (min=5, max=20)
	private String name;
	
	@NotEmpty @Size(min=5, max=15)
	private String dept;
	
	@Positive
	private Double salary;

	public EmployeeDetails(String name,
			String dept, Double salary) {
		
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	
}