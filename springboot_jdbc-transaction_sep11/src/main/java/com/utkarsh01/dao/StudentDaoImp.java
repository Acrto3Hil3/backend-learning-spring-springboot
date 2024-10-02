package com.utkarsh01.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.entity.StudentRecord;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class StudentDaoImp implements StudentDao {

	private String INSERT = "insert into student_record (stu_name,stu_address,stu_mobile_no) values(?,?,?)";

	@Autowired
	private JdbcTemplate jdbcTemp;

	@Override
	@Transactional(rollbackForClassName = { "java.lang.Exception" })
	public void insertStudent(StudentRecord stu) throws Exception {
		try {
			log.debug("Employee Name : {}, {},{}", stu.getSName(), stu.getSAddress(), stu.getSMobileNo());
			jdbcTemp.update(INSERT, stu.getSName(), stu.getSAddress(), stu.getSMobileNo());
			log.info("Student record is successfuly insert...");
			int c = 12 / 0;
		} catch (Exception e) {
			log.error("Arrithematic error : {} ", e.getMessage());
		}
	}

}
