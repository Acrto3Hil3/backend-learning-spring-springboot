package com.utkarsh01.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Entity
@Table( name = "student04")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;
	private Double mobile;
	private Double marks;
	
	public Student(String name, String address, Double mobile, Double marks) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.marks = marks;
	}
	
	
}
