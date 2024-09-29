package com.utkarsh.DAO;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.utkarsh.model.Student;

public class StudentDAOImple implements StudentDAO{

	public String Insert="insert into Student values(?,?,?,?)";
	
	public StudentDAOImple() {
		super();
	}

	private JdbcTemplate jdbctemp;
	
	
	
	/*
	 * public StudentDAOImple(DataSource dataSource) { jdbctemp=new
	 * JdbcTemplate(dataSource); }
	 */
	public void setDataSource(DataSource datasource) {
		jdbctemp=new JdbcTemplate(datasource);
	}
	
	@Override
	public void insertStudent(Student s) {
	
			jdbctemp.update(Insert,s.getRollNumber(),s.getFirstName(),s.getLastName(),s.getPhNo());
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void deleteStudent(Student s) {
		// TODO Auto-generated method stub
		
	}
	
}
