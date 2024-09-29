package com.utkarsh01.dao;

import java.util.List;

import com.utkarsh01.entity.Employee;

public interface EmployeeDao {
		
//	public void addDetails(Employee emp);
//	
//	public void updateDetails(Employee emp);
//	
	public void deleteDetails(Integer id);
	
//	public Employee getOneDetails(Integer id);
	
	public  List<Employee> showDetails();
}
