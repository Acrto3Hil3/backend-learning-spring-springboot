package com.utkarsh01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utkarsh01.entity.Student;
import com.utkarsh01.service.StudentService;



@Controller
public class HomeController {

	@Autowired
	private StudentService stuService;

	@GetMapping(value = {"/","/home"})
	public String home(Model model) {
		model.addAttribute("stuKey", stuService.showAll());
		return "home";
	}
	
	@GetMapping("/addStudent")
	public String addStudent(Model model) {
		model.addAttribute(new Student());
		return "addStudentPage";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@Validated Student stu, BindingResult rs) {
		if(rs.hasErrors())
			return "AddStudentPage";
		stuService.addStudent(stu);
		return "redirect:/home";
	}
	
	@GetMapping("/editStudent/{id}")
	public String editStudent(@PathVariable("id") Integer id,Model model) {
		model.addAttribute(stuService.ShowById(id));
		return "editStudentPage";
	}
	
	@PostMapping("/updateStudent")
	public String updateStudent(@Validated Student stu,BindingResult rs) {
		if(rs.hasErrors())
			return "editStudentPage";
		stuService.updateStudent(stu);
		return "redirect:/home";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") Integer id) {
		stuService.deleteStudent(id);
		return "redirect:/home";
	}
	
}
