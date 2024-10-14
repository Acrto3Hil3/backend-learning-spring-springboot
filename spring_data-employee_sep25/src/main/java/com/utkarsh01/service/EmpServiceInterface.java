package com.utkarsh01.service;

import java.util.List;

import com.utkarsh01.entity.Employee;

public interface EmpServiceInterface {
	List<Employee> showAll();
	
	Employee showOne(Integer id);
	
	void insertEmp(Employee emp);
	
	void updateEmp(Employee emp);
	
	void deleteEmp(Integer id);
	
	List<Employee> searchEmpByName(String name);
}
