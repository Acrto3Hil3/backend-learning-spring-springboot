package com.utkarsh01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utkarsh01.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
	
}
