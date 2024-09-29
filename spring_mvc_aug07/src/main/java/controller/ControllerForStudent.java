package controller;


import java.util.Date;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerForStudent {
	Scanner sc=new Scanner(System.in);
	@RequestMapping("/showStudentData")
	
	public ModelAndView showStudentData() {
		String name=sc.nextLine();
		Date date=new Date();
		
		ModelAndView mv=new ModelAndView("/WEB-INF");
		return null;
	}
}
