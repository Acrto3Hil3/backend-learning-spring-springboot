package com.utkarsh01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.utkarsh01.modelEntity.Employee;

@SpringBootTest
class SpringBootContextSep09ApplicationTests {

	@Autowired
@Qualifier("emp2")
	private Employee emp;
	
	@Test 
	void testToCreate() {
		System.out.println(emp);
	}
	
}
