package com.utkarsh01.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.utkarsh01.model.EmployeeDetails;


public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
	
	
	private String GET_ALL = "SELECT *  FROM employeedata";
	private String ADD="insert into employeedata(name,dept,salary) values(?,?,?)";
	private String DELETE="delete from employeedata where empId=?"; 
	private String GET_ONE="select * from employeedata where empId=?";
	private String UPDATE="update employeedata set name=?,dept=?,salary=? where empId=?";
	private RowMapper<EmployeeDetails> rowMapper;
	
	public void setRowMapper(RowMapper<EmployeeDetails> rowMapper) {
		this.rowMapper=rowMapper;
	}

	@Override
	public void saveEmployee(EmployeeDetails emp) {
		getJdbcTemplate().update(ADD,emp.getName(),emp.getDept(),emp.getSalary());
		
	}

	@Override
	public List<EmployeeDetails> getAllEmployees() {
		return getJdbcTemplate().query(GET_ALL, rowMapper);
	}

	@Override
	public void deleteEmployee(Integer empId) {
		getJdbcTemplate().update(DELETE,empId);
		
	}

	@Override
	public EmployeeDetails getEmployee(Integer empId) {
		List<EmployeeDetails> empObj=getJdbcTemplate().query(GET_ONE, rowMapper,empId);
		return empObj.get(0);
	}

	@Override
	public void updateEmployee(EmployeeDetails empObj) {
		getJdbcTemplate().update(UPDATE,empObj.getName(),empObj.getDept(),empObj.getSalary(),empObj.getEmpId());
	}

	
}
