package com.utkarsh01.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utkarsh01.dao.EmployeeDao;
import com.utkarsh01.entity.Employee;

public class SpringTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao=ctx.getBean("daoImp",EmployeeDao.class);
		
//		Employee e=new Employee("Shiva", "DL", 55800d);
////		Employee e=new Employee();
//		dao.addEmp(e);
//		System.out.println("Data iserted succefully..");
		
//		Employee e=dao.getOneEmp(1);
//		System.out.println(e);
//		e.setAddress("J & K");
//		dao.updateEmp(e);
//		System.out.println("Updataion done..");
//		e=dao.getOneEmp(1);
//		System.out.println(e);
	
//		dao.deleteEmp(4);
//		System.out.println("Deleted..");
		
//		for(Employee e:dao.getAllEmp()) {
//			System.out.println(e);
////			dao.getOneEmp(e.getId());
//		}
		
		dao.getAllEmp().forEach(e->System.out.println(e));
		
		
		
		
	}

}
