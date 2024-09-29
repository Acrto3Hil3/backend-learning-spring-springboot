package com.utkarsh01.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.utkarsh01.model.EmployeeDetails;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
	
	
	private String GET_ALL = "SELECT empId, name, dept, salary FROM employeedata";
	private String ADD="insert into employeedata(name,dept,salary) values(?,?,?)";

	private RowMapper<EmployeeDetails> rowMapper;
	
	@Override
	public List<EmployeeDetails> getAllEmployee() {

		return getJdbcTemplate().query(GET_ALL, rowMapper);
	}

	@Override
	public void addEmp(EmployeeDetails emp) {
		 getJdbcTemplate().update(ADD,emp.getName(),emp.getDept(),emp.getSalary());
	}
	
	
}
