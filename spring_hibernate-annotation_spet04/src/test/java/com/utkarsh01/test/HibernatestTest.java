package com.utkarsh01.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utkarsh01.config.PatientConfig;
import com.utkarsh01.dao.PatientDao;
import com.utkarsh01.entity.PatientEntity;
public class HibernatestTest {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(PatientConfig.class);
		
		PatientDao dao=(PatientDao) ctx.getBean(PatientDao.class);
		
		PatientEntity pat=new PatientEntity("Shivam",23,"Delhi","AB+",40000d);
		System.out.println("Insertion completed..");
		
//		dao.getAllPatient().forEach(patient-> System.out.println(patient));
	}

}
