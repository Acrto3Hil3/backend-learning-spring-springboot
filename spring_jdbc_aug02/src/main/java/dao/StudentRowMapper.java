package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.StudentField;

public class StudentRowMapper implements RowMapper<StudentField> {

	@Override
	public StudentField mapRow(ResultSet rs, int rowNum) throws SQLException {

		StudentField st=new StudentField();
		st.setRoll_number(rs.getInt("rollNUmber"));
		st.setFirst_Name(rs.getString("firstName"));
		st.setLast_Name(rs.getString("lastName"));
		st.setPhoneNo(rs.getLong("phno"));
		
		return st;
	}

}
