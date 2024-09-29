package com.utkarsh01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.dao.EmployeeDao;
import com.utkarsh01.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao dao;
	
	public List<Employee> showEmpDetails(){
		return dao.showDetails();
	}
	
	@Transactional(rollbackForClassName = {"java.lang.Exception"} )
	public void deleteEmpDetails(Integer id) {
		dao.deleteDetails(id);
	}
}
