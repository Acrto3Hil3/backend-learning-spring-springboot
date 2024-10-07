package com.utkarsh01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.entity.Student;
import com.utkarsh01.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository stuRepo;
	
	public List<Student> showAll(){
		return stuRepo.findAll();
	}
	
	public Student ShowById(Integer sId) {
		return stuRepo.findById(sId).get();
	}
	
	@Transactional(rollbackForClassName = {"java.lang.Excpetion"} )
	public Student addStudent(Student stu) {
		return  stuRepo.save(stu);
	}
	
	@Transactional(rollbackForClassName = {"java.lang.Excpetion"} )
	public Student updateStudent(Student stu) {
		return stuRepo.save(stu);
	}
	
	@Transactional(rollbackForClassName = {"java.lang.Excpetion"} )
	public void deleteStudent(Integer sId) {
		stuRepo.deleteById(sId);
	}
	
}
