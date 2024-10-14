package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.utkarsh01.entity.Employee;
import com.utkarsh01.service.EmpRepositoryService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmpRepositoryService service;
	
	@RequestMapping("/showAll")
	public String showAllEmployeee(Model model) {
		model.addAttribute("empKey",service.showAll());
		return "showPage";
	}
	
	@RequestMapping("/addEmp")
	public String addEmployee(Model model) {
		model.addAttribute(new Employee());
		return "addPage";
	}
	
	@RequestMapping("/saveEmp")
	public String saveEmployee(@ModelAttribute Employee emp) {
		service.insertEmp(emp);
		return "redirect:/showAll";
	}
	
	@RequestMapping("/editEmp")
	public String editEmployee(@RequestParam("id") Integer id,Model model) {
		System.out.println(id);
		Employee emp=service.showOne(id);
		model.addAttribute(emp);
		return "editPage";
	}
	
	@RequestMapping("/updateEmp")
	public String updateEmployee(@ModelAttribute Employee emp) {
		service.updateEmp(emp);
		return "redirect:/showAll";
	}
	
	@RequestMapping("/deleteEmp")
	public String deleteEmployee(@RequestParam("id") Integer id) {
		service.deleteEmp(id);
		return "redirect:/showAll";
	}
	
	@RequestMapping("searchEmp")
	public String searchEmployee(@RequestParam("name") String name,Model model) {
		List<Employee> emp=null;
		if(name.trim().length()==0) {
			emp=service.showAll();
//			System.out.println("if condition");
		}
		else {
			emp=service.searchEmpByName(name);
//			System.out.println("else condition");
		}
		model.addAttribute("empKey",emp);
		return "showPage";
	}
	
}
