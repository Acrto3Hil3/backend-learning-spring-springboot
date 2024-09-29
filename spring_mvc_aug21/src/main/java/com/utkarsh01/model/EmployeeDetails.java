package com.utkarsh01.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
	public class EmployeeDetails {
	private Integer empId;
	private String name;
	private String dept;
	private Double salary;
		public EmployeeDetails(String name,String dept,Double salary) {
			this.name=name;
			this.dept=dept;
			this.salary=salary;
		}
	

}
