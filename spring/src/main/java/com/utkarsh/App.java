package com.utkarsh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		Alien obj1=(Alien)ctx.getBean("alien1");		
		System.out.println(obj1.hashCode());
		obj1.code();
	}

}
