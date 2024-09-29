package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import modal.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("E:\\spring.xml");
		
		Student s1=(Student)ctx.getBean("s1");
		System.out.println(s1);
		
		Student s2=(Student)ctx.getBean("s2");
		System.out.println(s2);
	}

}
