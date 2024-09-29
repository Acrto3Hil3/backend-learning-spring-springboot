package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.EmployeeDetails;

public class EmployeeROwMapper implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDetails emp=new EmployeeDetails();
		emp.setEmpId(rs.getString("empId"));
		emp.setEName(rs.getString("eName"));
		emp.setEDesg(rs.getString("eDesg"));
		emp.setESal(rs.getLong("eSal"));
		return emp;
	}
	
	
	
	
}
