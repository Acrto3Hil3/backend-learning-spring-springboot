package com.utkarsh01.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.utkarsh01.entity.Employee;

@Component
public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e=new Employee();
		e.setId(rs.getInt("id"));
		e.setFirstName(rs.getString("firstName"));
		e.setLastName(rs.getString("lastName"));
		e.setAddress(rs.getString("address"));
		e.setMobile(rs.getLong("mobile"));
		e.setSalary(rs.getDouble("salary"));
		return e;
	}
	
	
}
