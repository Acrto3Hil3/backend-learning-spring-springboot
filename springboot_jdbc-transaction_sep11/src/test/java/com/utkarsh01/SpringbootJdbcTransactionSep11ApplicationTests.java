package com.utkarsh01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.utkarsh01.dao.StudentDao;
import com.utkarsh01.entity.StudentRecord;

@SpringBootTest
class SpringbootJdbcTransactionSep11ApplicationTests {

	@Autowired
	private StudentDao dao;
	
	
	@Test
	void contextLoads() throws Exception {
		StudentRecord stu=new StudentRecord("Praveen","Delhi",96385296d);
		dao.insertStudent(stu);
		System.out.println("Student details in successfully insert...");
	}

}
