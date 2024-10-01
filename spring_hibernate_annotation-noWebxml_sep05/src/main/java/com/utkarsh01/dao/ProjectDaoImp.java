package com.utkarsh01.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.entity.ProjectEntity;

public class ProjectDaoImp extends HibernateDaoSupport implements ProjectDao {

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void insertProDetails(ProjectEntity pro) {
		getHibernateTemplate().save(pro);
		
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"} )
	public void updateProDetails(ProjectEntity pro) {
		getHibernateTemplate().save(pro);
		
	}

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"} )
	public void deleteProDetails(Integer projectId) {
		ProjectEntity pro=getOneProDetail(projectId);
		getHibernateTemplate().delete(pro);
		
	}

	@Override
	public ProjectEntity getOneProDetail(Integer projectId) {
		ProjectEntity pro=getHibernateTemplate().get(ProjectEntity.class, projectId);
		return pro;
	}

	@Override
	public List<ProjectEntity> getAllProjects() {
		return getHibernateTemplate().loadAll(ProjectEntity.class);
	}
}
