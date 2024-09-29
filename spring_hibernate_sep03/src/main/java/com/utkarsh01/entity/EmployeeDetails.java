package com.utkarsh01.entity;




import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetails{
	
	private Integer empId;
	
	@NotNull @Size (min=5, max=20)
	private String name;
	
	@NotEmpty @Size(min=5, max=15)
	private String dept;
	
	@Range(min=0, max=25000)
	private Double salary;

	public EmployeeDetails(String name, String dept, Double salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	
}