package com.utkarsh01.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.utkarsh01.entity.EmployeeDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	private String GET_ALL = "SELECT *  FROM employeedata";
	private String ADD = "insert into employeedata(name,dept,salary) values(?,?,?)";
	private String DELETE = "delete from employeedata where empId=?";
	private String GET_ONE = "select * from employeedata where empId=?";
	private String UPDATE = "update employeedata set name=?,dept=?,salary=? where empId=?";
	private RowMapper<EmployeeDetails> rowMapper;

	@Override
	public List<EmployeeDetails> showAllEmpl() {
		return getJdbcTemplate().query(GET_ALL, rowMapper);
	}

	@Override
	public void addEmplDetails(EmployeeDetails empDaoObj) {
		getJdbcTemplate().update(ADD, empDaoObj.getName(), empDaoObj.getDept(), empDaoObj.getSalary());

	}

	@Override
	public EmployeeDetails oneEmplDetails(Integer epmId) {
		List<EmployeeDetails> empObj = getJdbcTemplate().query(GET_ONE, rowMapper, epmId);
		return empObj.get(0);
	}

	@Override
	public void updateEmpDetails(EmployeeDetails emp) {
		getJdbcTemplate().update(UPDATE, emp.getName(), emp.getDept(), emp.getSalary(), emp.getEmpId());

	}

	@Override
	public void deleteEmpDetails(Integer empId) {
		getJdbcTemplate().update(DELETE, empId);
	}

}
