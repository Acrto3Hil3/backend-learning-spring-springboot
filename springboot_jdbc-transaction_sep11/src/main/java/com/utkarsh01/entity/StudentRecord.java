package com.utkarsh01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor 
public class StudentRecord {
	private Integer sId;
	private String sName;
	private String sAddress;
	private Double sMobileNo;
	public StudentRecord(String sName, String sAddress, Double sMobileNo) {
		super();
		this.sName = sName;
		this.sAddress = sAddress;
		this.sMobileNo = sMobileNo;
	}
		
}
