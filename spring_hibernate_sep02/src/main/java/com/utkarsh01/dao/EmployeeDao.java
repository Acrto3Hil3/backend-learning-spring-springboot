package com.utkarsh01.dao;

import java.util.List;

import com.utkarsh01.entity.Employee;

public interface EmployeeDao {
	public void addEmp(Employee e) throws Exception;
	public void updateEmp(Employee e);
	public void deleteEmp(Integer id);
	public Employee getOneEmp(Integer id);
	public List<Employee> getAllEmp();
	
}
