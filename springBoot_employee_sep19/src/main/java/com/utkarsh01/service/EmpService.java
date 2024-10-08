package com.utkarsh01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.dao.EmpDao;
import com.utkarsh01.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Service @Slf4j
public class EmpService {
	
	@Autowired
	private  EmpDao dao;
	
	public List<Employee> showAll(){
		return dao.showAllDetails();
	}
	
	public Employee showOne(Integer id) {
		Employee emp=dao.showOneDetails(id);
		return emp;
	}
	
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void addRecord(Employee emp) {
		log.info("Employee details saved..");
		dao.insertDetails(emp);
	}
	
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void updateRecord(Employee emp) {
		log.info("Employee details updated...");
		dao.updateDetails(emp);
	}
	
	@Transactional(noRollbackForClassName = {"java.lang.Exception"})
	public void deleteRecord(Integer id) {
		log.info("Employee details deleted....");
		dao.deleteDetails(id);
	}
}
