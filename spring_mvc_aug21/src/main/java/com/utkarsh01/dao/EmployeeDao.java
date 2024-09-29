package com.utkarsh01.dao;

import java.util.List;
import com.utkarsh01.model.EmployeeDetails;

public interface EmployeeDao {
	
	public void saveEmployee(EmployeeDetails emp);
	public List<EmployeeDetails> getAllEmployees();
	public void deleteEmployee(Integer empId);
	public EmployeeDetails getEmployee(Integer empId);
	public void updateEmployee(EmployeeDetails empObj);
}
