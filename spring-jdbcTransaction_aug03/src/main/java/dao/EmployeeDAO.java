package dao;


import java.util.List;

import model.EmployeeDetails;

public interface EmployeeDAO {
	
	public void insertDetails(EmployeeDetails emp);
	
	public void updateDetails(EmployeeDetails emp);
	
	public void deleteDetails(String empId);
	
	public EmployeeDetails fetchDetails(String empId);
	
	public List<EmployeeDetails> fetchAll();
	
	public void deleteAll();
	

}
