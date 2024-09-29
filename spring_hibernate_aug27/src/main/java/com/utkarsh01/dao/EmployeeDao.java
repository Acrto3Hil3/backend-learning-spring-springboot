package com.utkarsh01.dao;

import java.util.List;

import com.utkarsh01.entity.EmployeeDetails;

public interface EmployeeDao {

	public List<EmployeeDetails> showAllEmpl();

	public void addEmplDetails(EmployeeDetails empDaoObj);

	public EmployeeDetails oneEmplDetails(Integer empId);

	public void updateEmpDetails(EmployeeDetails empObj);

	public void deleteEmpDetails(Integer empId);
}
