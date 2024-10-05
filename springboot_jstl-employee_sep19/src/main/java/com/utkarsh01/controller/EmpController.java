package com.utkarsh01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.utkarsh01.entity.Employee;
import com.utkarsh01.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService eSer;
	
	@RequestMapping("/showEmp")
	public String showData(Model model) {
		model.addAttribute("empKey",eSer.showAll());
		return "showPage";
	}
	
	@RequestMapping("/addEmp")
	public String addData(Model model) {
		model.addAttribute(new Employee());
		return "addPage";
	}
	
	@RequestMapping("/saveEmp")
	public String saveData(@ModelAttribute Employee emp) {
		eSer.addRecord(emp);
		return "redirect:/showEmp";
	}
	
	@RequestMapping("/editEmp")
	public String editData(@RequestParam("id") Integer id,Model model) {
		Employee emp=eSer.showOne(id);
		model.addAttribute(emp);
		return "editPage";
	}
	
	@RequestMapping("/updateEmp")
	public String updateDate(@ModelAttribute Employee emp) {
		eSer.updateRecord(emp);
		return "redirect:/showEmp";
	}
	
	@RequestMapping("/deleteEmp")
	public String deleteData(@RequestParam("id") Integer id) {
		eSer.deleteRecord(id);
		return "redirect:/showData";
	}
}
