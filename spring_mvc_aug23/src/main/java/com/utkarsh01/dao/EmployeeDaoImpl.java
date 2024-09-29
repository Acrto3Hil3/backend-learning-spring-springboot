package com.utkarsh01.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.utkarsh01.model.EmployeeDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
	
	
	private String GET_ALL = "SELECT *  FROM employeedata";
	private String ADD="insert into employeedata(name,dept,salary) values(?,?,?)";
	private String DELETE="delete from employeedata where empId=?"; 
	private String GET_ONE="select * from employeedata where empId=?";
	private String UPDATE="update employeedata set name=?,dept=?,salary=? where empId=?";
	private RowMapper<EmployeeDetails> rowMapper;
	
	@Override
	public List<EmployeeDetails> showAllEmpl() {
		return getJdbcTemplate().query(GET_ALL, rowMapper);
	}
	@Override
	public void addEmplDetails(EmployeeDetails empDaoObj) {
		getJdbcTemplate().update(ADD,empDaoObj.getName(),empDaoObj.getDept(),empDaoObj.getSalary());
		
	}
	@Override
	public EmployeeDetails oneEmplDetails(Integer epmId) {
		
		return null;
	}
	@Override
	public void updateEmpDetails(Integer empId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteEmpDetails(Integer empId) {
		
	}
	
	
	
}
