package com.utkarsh01.dao;

import java.util.List;

import com.utkarsh01.entity.ProjectEntity;

public interface ProjectDao {
	public void insertProDetails(ProjectEntity pro);
	
	public void updateProDetails(ProjectEntity pro);
	
	public void deleteProDetails(Integer projectId);
	
	public ProjectEntity getOneProDetail(Integer projectId);
	
	public List<ProjectEntity> getAllProjects();
}
