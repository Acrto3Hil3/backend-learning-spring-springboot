package com.utkarsh01.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.entity.Employee;
import static  com.utkarsh01.constant.EmpQuery.*;
import lombok.extern.slf4j.Slf4j;

@Component @Slf4j
public class EmpDaoImp implements EmpDao {

	@Autowired
	private EmpRowMapper rowMap;
	
	@Autowired
	private JdbcTemplate jdbcTemp;
	
	@Override
	public List<Employee> showAllDetails() {
		return jdbcTemp.query(GET_ALL, rowMap);
	}

	@Override
	public Employee showOneDetails(Integer id) {
		return jdbcTemp.query(GET_ONE, rowMap,id).get(0);
	}

	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	@Override
	public void insertDetails(Employee emp) {
		log.info("EMployee details is added...");
		jdbcTemp.update(INSERT,emp.getName(),emp.getPosition(),emp.getSalary());
	}

	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	@Override
	public void updateDetails(Employee emp) {
		log.info("Employee details is updated...");
		jdbcTemp.update(UPDATE,emp.getName(),emp.getPosition(),emp.getSalary(),emp.getId());
	}

	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	@Override
	public void deleteDetails(Integer id) {
		log.info("Employee details is deleted..");
			jdbcTemp.update(DELETE,id);
	}

}
