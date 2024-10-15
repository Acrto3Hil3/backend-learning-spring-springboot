package com.utkarsh01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor
public class Student {
	private Integer id;
	private String name;
	private String qualification;
	private String city;
}
