package com.utkarsh01.dao;

import java.util.List;
import com.utkarsh01.model.EmployeeDetails;

public interface EmployeeDao {
	
	public List<EmployeeDetails> showEmp();
	public void addEmp(EmployeeDetails emp);
	public void deleteEmp(Integer empId);
}
