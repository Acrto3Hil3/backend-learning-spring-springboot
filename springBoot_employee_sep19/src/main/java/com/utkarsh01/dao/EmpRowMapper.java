package com.utkarsh01.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.utkarsh01.entity.Employee;

@Component
public class EmpRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setPosition(rs.getString("position"));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}

}
