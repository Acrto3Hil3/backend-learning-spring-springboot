package test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDAO;
import model.StudentField;

public class Test {

	

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		StudentDAO dao=(StudentDAO) ctx.getBean("daoInterface");
		
		
		
		
		
	}

}
