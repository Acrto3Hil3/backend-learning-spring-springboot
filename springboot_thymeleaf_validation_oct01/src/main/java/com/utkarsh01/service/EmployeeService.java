package com.utkarsh01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.entity.Employee;
import com.utkarsh01.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> showAll(){
		return repository.findAll();
	}
	
	public Employee showOne(Integer id) {
		return repository.findById(id).get();
	}
	
	@Transactional(rollbackForClassName = {"java.lang.Excpetion"})
	public Employee insertEmployee(Employee emp) {
		return repository.save(emp);
	}
	@Transactional(rollbackForClassName = {"java.lang.Excpetion"})
	public Employee updateEmployee(Employee emp) {
		return repository.save(emp);
	}
	@Transactional(rollbackForClassName = {"java.lang.Excpetion"})
	public void deleteEmployee(Integer	id) {
		 repository.deleteById(id);
	}
}
