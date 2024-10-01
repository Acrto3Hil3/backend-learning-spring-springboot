package com.utkarsh01.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@Entity @NoArgsConstructor
public class ProjectEntity {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;
	
	@NotNull @Size(min=3, max=20)
	private String projectName;
	
	@NotNull @Size(min=3,max=25)
	private String projectType;
	
	@Min(value = 0)
	private String projectBudget;

	public ProjectEntity(String projectName, String projectType, String projectBudget) {
		this.projectName = projectName;
		this.projectType = projectType;
		this.projectBudget = projectBudget;
	}
	
	

}
