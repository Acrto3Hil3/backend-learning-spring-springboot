package com.utkarsh01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.utkarsh01.dao.EmployeeDao;
import com.utkarsh01.model.EmployeeDetails;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao empDao;

	@RequestMapping("/showEmp")
	public String show(Model model) {
		List<EmployeeDetails> emp = empDao.showEmp();
		model.addAttribute("employee", emp);
		return "showEmp";
	}

	@RequestMapping("/saveEmp")
	public String addEmp(HttpServletRequest req) {
		String empId = req.getParameter("empId");

		String name = req.getParameter("name");

		String des = req.getParameter("dept");

		String sal = req.getParameter("salary");

		EmployeeDetails emp = new EmployeeDetails(Integer.valueOf(empId), name, des, Double.valueOf(sal));
		empDao.addEmp(emp);
		return "redirect:/showEmp";
	}

	@RequestMapping("/addEmp")
	public String addEmployee() {
		return "addEmp";
	}

	@RequestMapping("deleteEmp")
	public String deleteEmp(HttpServletRequest req) {
		String id = (String) req.getParameter("empId");
		empDao.deleteEmp(Integer.valueOf(id));
		return "redirect:/showEmp";
	}

}
