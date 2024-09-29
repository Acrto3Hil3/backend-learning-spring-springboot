package com.utkarsh01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class StudentRecord {
	private Integer stId;
	private String firstName;
	private String lastName;
	private Long mobileNo;
	private String Address;
	
	
	public StudentRecord(String firstName, String lastName, Long mobileNo, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		Address = address;
	}
	
	
}
