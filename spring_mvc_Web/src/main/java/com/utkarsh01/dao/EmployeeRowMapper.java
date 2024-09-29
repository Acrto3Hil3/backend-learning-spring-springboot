package com.utkarsh01.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.utkarsh01.model.EmployeeDetails;

public class EmployeeRowMapper implements RowMapper<EmployeeDetails>{

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDetails emp=new EmployeeDetails();
		emp.setEmpId(rs.getInt("empId"));
		emp.setName(rs.getString("name"));
		emp.setDept(rs.getString("dept"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}	
}
