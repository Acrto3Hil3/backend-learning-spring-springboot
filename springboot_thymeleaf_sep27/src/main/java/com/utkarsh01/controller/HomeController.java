package com.utkarsh01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utkarsh01.model.Student;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("header","Employee Management System");
		List<String> languages=new ArrayList<>();
		languages.add("Java");
		languages.add("C#");
		languages.add("Python");
		languages.add("AWS");
		model.addAttribute("lang",languages);
		model.addAttribute("stuKey", getStudent());
		return "home";	
	}
	
	private List<Student> getStudent(){
		List<Student> stu=new ArrayList<>();
		for(int i=1;i<=5;i++) {
			Student st=new Student(i,"Karan"+i,"B.tech","Hyd");
			stu.add(st);
		}
		return stu;
	}
	
	@RequestMapping(value = { "/happy","/registration"})
	public String registration(Model model) {
		model.addAttribute(new Student());
		return "student";
	}
	
	@RequestMapping("/saveStudent")
	public String save(@ModelAttribute Student st, Model model) {
		model.addAttribute("stuKey", st);
		return "success";
	}
}
