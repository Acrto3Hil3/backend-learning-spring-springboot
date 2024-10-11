package com.utkarsh01;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.utkarsh01.entity.Student;
import com.utkarsh01.repository.StudentRepo;

@SpringBootTest
class SpringDataSep23ApplicationTests {
	@Autowired
	private StudentRepo sRepo;
	
	@Test
	// find by marks default method
	void test1() {
		List<Student> stu=sRepo.findByMarks(55d);
		stu.forEach(s->System.out.println(s));
		System.out.println("Marks obtained..");	
		Assertions.assertEquals(1, stu.size());
		}
		
	@Test
	// find by name and marks of default method
	void test2() {
		List<Student> stu=sRepo.findByNameAndMarks("Sham", 55d);
		stu.forEach(s->System.out.println(s));
	}
	
	@Test
	void test3() {
		List<Student> stu=sRepo.getLessMarkstLess();
		stu.forEach(s->System.out.println(s));
		Assertions.assertEquals(1, stu.size());
	}
	
	@Test
	void test4() {
		List<Student> stu=sRepo.getMarksWithParams(90d);
		stu.forEach(s->System.out.println(s));
	Assertions.assertEquals(1, stu.size());
	}
	
	@Test
	void test5() {
		List<Student> stu=sRepo.getMarksNativeSQL();
		stu.forEach(s->System.out.println(s));
		Assertions.assertEquals(2, stu.size());
	}
	
	@Test
	void test6() {
		Double maxSalary=sRepo.getMaxMarks();
		System.out.println("max salary : "+maxSalary);
		Assertions.assertTrue(maxSalary>0);
	}
}
