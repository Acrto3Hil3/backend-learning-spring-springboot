package com.utkarsh01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh01.entity.Course;
import com.utkarsh01.repository.CourseRepo;

import lombok.extern.slf4j.Slf4j;

@Service @Slf4j
public class CourseService {
	
	@Autowired
	private CourseRepo repo;
	
	@Transactional(rollbackForClassName = {"java.langExeption"})
	public Course addCourse(Course cur) {
		return repo.save(cur);
	}
	
	public List<Course> showall(){
		return repo.findAll();
	}
	
	public Course showOne(Long id) {
		return repo.findById(id).get();
	}
	
	public void deleteCourse(Long id) {
		repo.deleteById(id);
	}
	
}
