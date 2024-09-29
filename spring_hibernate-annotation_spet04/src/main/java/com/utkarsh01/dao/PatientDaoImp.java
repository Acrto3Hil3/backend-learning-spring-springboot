package com.utkarsh01.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.entity.PatientEntity;

public class PatientDaoImp extends HibernateDaoSupport implements PatientDao {

	@Override 
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void addPatientDetails(PatientEntity pat) {
		getHibernateTemplate().save(pat);
	}

	@Override
	@Transactional(rollbackForClassName = {"Java.lang.Exception"})
	public void updatePatientDetails(PatientEntity pat) {	
		getHibernateTemplate().save(pat);
	}

	@Override
	@Transactional(rollbackForClassName = {"java.util.Exception"})
	public void deletePatientDetails(Integer pId) {
		PatientEntity pat=getOnePatient(pId);
		getHibernateTemplate().delete(pat);
	}

	@Override
	public PatientEntity getOnePatient(Integer pId) {
		PatientEntity pat=getHibernateTemplate().get(PatientEntity.class, pId);
		return pat;
	}

	@Override
	public List<PatientEntity> getAllPatient() {
		return getHibernateTemplate().loadAll(PatientEntity.class);
	}

}
