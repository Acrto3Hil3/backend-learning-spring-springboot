package com.utkarsh01.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;


import com.utkarsh01.entity.Employee;

public class EmployeeDaoImp extends HibernateDaoSupport implements EmployeeDao{

	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void addEmp(Employee emp) throws Exception {
		
		if(emp.getName()!=null || emp.getAddress()!=null || emp.getSalary()!=null) {
			getHibernateTemplate().save(emp);
		}	
		else
			throw new Exception("Data is not saves please check onnce it properly entered or not");
	}
	
	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void updateEmp(Employee e) {
		getHibernateTemplate().update(e);
		
	}

	@Override
	@Transactional(noRollbackForClassName = {"java.lang.Exception"})
	public void deleteEmp(Integer id) {
		Employee e=getOneEmp(id);
		getHibernateTemplate().delete(e);
		
	}

	@Override
	public Employee getOneEmp(Integer id) {
		Employee emp=getHibernateTemplate().get(Employee.class, id);
		return emp;
	}

	
	@Override
	public List<Employee> getAllEmp() {
		Session sess=getHibernateTemplate().getSessionFactory().openSession();
		Query<Employee> query=sess.createQuery("from Employee");
		List<Employee> empList=query.getResultList();
		return empList;
		
	}


}
