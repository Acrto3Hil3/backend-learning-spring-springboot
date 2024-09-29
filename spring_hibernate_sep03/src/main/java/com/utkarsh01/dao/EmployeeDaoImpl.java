package com.utkarsh01.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.entity.EmployeeDetails;


public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	@Transactional(rollbackForClassName = "java.lang.Exception")
	public void addEmplDetails(EmployeeDetails empDaoObj) {
		getHibernateTemplate().save(empDaoObj);
	}

	@Override
	@Transactional(rollbackForClassName = "java.lang.Exception")
	public void updateEmpDetails(EmployeeDetails empObj) {
		getHibernateTemplate().update(empObj);
	}

	@Override
	@Transactional(rollbackForClassName = "java.lang.Exception")
	public void deleteEmpDetails(Integer empId) {
		EmployeeDetails e=getOneEmp(empId);
		getHibernateTemplate().delete(e);
	}
	
	@Override
	public EmployeeDetails getOneEmp(Integer empId) {
		EmployeeDetails e=getHibernateTemplate().get(EmployeeDetails.class, empId);
		return e;
	}

	@Override 
	public List<EmployeeDetails> showAllEmpl() {
		return getHibernateTemplate().loadAll(EmployeeDetails.class);
	}

}
