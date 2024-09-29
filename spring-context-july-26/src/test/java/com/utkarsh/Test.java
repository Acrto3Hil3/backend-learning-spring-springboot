package com.utkarsh;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		Student s1=ctx.getBean("s1",Student.class);
		System.out.println(s1);
		
		Student s2=ctx.getBean("s2",Student.class);
		System.out.println(s2);
		
		Student s3=ctx.getBean("s3",Student.class);
		System.out.println(s3);
		
		Student s4=(Student)ctx.getBean("s4");
		System.out.println(s4);
		
	}
}
