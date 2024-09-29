package com.utkarsh01.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.utkarsh01.entity.Employee;
import com.utkarsh01.constant.*;
import lombok.extern.slf4j.Slf4j;

@Component 
@Slf4j
public class EmployeeDaoImp implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemp;
	
	@Autowired
	private EmployeeRowMapper rowMapper;
	
	@Override
	public List<Employee> showDetails() {
		log.info("Displaying showDetails() method....");
		return jdbcTemp.query("select * from employee04", rowMapper);
	}

	@Override
	public void deleteDetails(Integer id) {
		log.info("Employee details is succefully deleted..");
		jdbcTemp.update("delete from employee04 where id=?",id);
		
		
	}
	
}
