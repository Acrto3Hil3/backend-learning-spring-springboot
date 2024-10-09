package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.utkarsh01.entity.Course;
import com.utkarsh01.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService cSer;
	
	@PostMapping("/addCourse")
	public String saveCourse(@RequestBody Course course) {
		course=cSer.addCourse(course);
		return "course is successfully saved :"+course.getId();
	}
	
	@GetMapping("/getAll")
	public List<Course> showAllCourses(){
		return cSer.showall();
	}
	// In PathVariable we need to pass the id through url adn through input
	@GetMapping("/getOnCourseById/{id}")
	public Course getCourse(@PathVariable("id") Long id) {
		return cSer.showOne(id);
	}
	// in RequestParam don't need to pass the id through url it fetches automatically.
	@GetMapping("/getOnCourse")
	public Course getOneCourse(@RequestParam("id") Long id) {
		return cSer.showOne(id);
	}
	
	@PostMapping("/updateCourse")
	public String updateCourse(@RequestBody Course course) {
		course=cSer.addCourse(course);
		return "Course is successfully updated.."+course.getId();
		}
	
	@PostMapping("/deleteCourse/{id}")
	public String deleteCurse(@PathVariable("id") Long id) {
		cSer.deleteCourse(id);
		return "Deleted successfully..";
	}
	
}
