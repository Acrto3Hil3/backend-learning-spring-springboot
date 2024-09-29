package com.utkarsh01.dao;

import java.util.List;
import com.utkarsh01.model.EmployeeDetails;

public interface EmployeeDao {
	
	public List<EmployeeDetails> showAllEmpl();
	
	public void addEmplDetails(EmployeeDetails empDaoObj);
	
	public  EmployeeDetails oneEmplDetails(Integer epmId);
	
	public void updateEmpDetails(Integer empId);

	public void deleteEmpDetails(Integer empId);
}
