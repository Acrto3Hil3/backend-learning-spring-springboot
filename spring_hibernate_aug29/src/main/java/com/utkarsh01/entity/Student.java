package com.utkarsh01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class Student {
	
	public Student(int sId, String name, String dept, Double mark) {
		this.sId = sId;
		this.name = name;
		this.dept = dept;
		this.mark = mark;
	}
	
	private int sId;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}

	private String name;
	private String dept;
	private Double mark;
}
