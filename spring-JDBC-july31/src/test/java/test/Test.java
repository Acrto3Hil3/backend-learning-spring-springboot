package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utkarsh.DAO.StudentDAO;
import com.utkarsh.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		StudentDAO dao=(StudentDAO) ctx.getBean("dao");
		
		Student st=new Student(1,"rAM","SINGH",9638529644l);
		
		dao.insertStudent(st);
		
		System.out.println("Success...");
		
		
	}

}
