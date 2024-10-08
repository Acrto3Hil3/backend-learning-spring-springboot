package com.utkarsh01.dao;

import java.util.List;

import com.utkarsh01.entity.Employee;

public interface EmpDao {
	public List<Employee> showAllDetails();
	public Employee showOneDetails(Integer id);
	public void insertDetails(Employee emp);
	public void updateDetails(Employee emp);
	public void deleteDetails(Integer id);
}
