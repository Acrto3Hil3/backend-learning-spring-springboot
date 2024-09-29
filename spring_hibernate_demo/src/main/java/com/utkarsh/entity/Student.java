package com.utkarsh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private Integer stRollNo;
	private String stName;
	private String stSection;
	private Double stMarks;
}
