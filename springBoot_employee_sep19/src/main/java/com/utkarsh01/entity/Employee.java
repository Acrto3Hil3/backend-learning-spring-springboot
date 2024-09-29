package com.utkarsh01.entity;

import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Employee {
	private Integer id;
	@NotEmpty @Nonnull
	private String firstName;
	@NotEmpty @Nonnull
	private String lastName;
	@NotEmpty @Nonnull
	private String address;
	@Size(min = 10,max = 11)
	private Long mobile;
	@Positive 
	private Double salary;
}
