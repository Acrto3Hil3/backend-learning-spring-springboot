package com.utkarsh01.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class Student {
	private Integer id;
	private String name;
	private Float marks;
	
}
