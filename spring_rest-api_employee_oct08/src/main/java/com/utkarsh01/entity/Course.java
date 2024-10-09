package com.utkarsh01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@Entity @NoArgsConstructor

public class Course {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer duration;
	private Double fee;
	private Integer extraSub;
	
	public Course(String name, Integer duration, Double fee, Integer extraSub) {
		super();
		this.name = name;
		this.duration = duration;
		this.fee = fee;
		this.extraSub = extraSub;
	}
	
}
