package com.utkarsh01.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data 
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "thymeleaf_validation")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eId;
	
	@NotEmpty 
	@Size(min=3,max=50) @Column(length = 40)
	private String eName;
	
	@NotEmpty @Column(length = 20)
	private String eDesg;
	
	@NotEmpty @Size(min=3,max = 20)
	private String eDepartment;
	
	@Positive @Max(30000)
	private Double eSalary;

	public Employee(@NotEmpty @Size(min = 3, max = 50) String eName, @NotEmpty String eDesg,
			@NotEmpty @Size(min = 3, max = 20) String eDepartment, @Positive @Max(30000) Double eSalary) {
		this.eName = eName;
		this.eDesg = eDesg;
		this.eDepartment = eDepartment;
		this.eSalary = eSalary;
	}
	
}
