package com.utkarsh01.test;

import com.utkarsh01.dao.StudentDao;
import com.utkarsh01.dao.StudentDaoImp;
import com.utkarsh01.entity.Student;

public class Hibernate {

	public static void main(String[] args) {
		
		StudentDao dao=new StudentDaoImp();
//		Student st=new Student("Ramu","Ameerpet",7800d);
//		dao.getAllStudentRecords(st);
//		System.out.println("Save is successfull..");
		
//		Student st=dao.getOneStudentRecord(1L);
//		System.out.println(st);
		
//		st.setAddress("SR Nagar");
//		dao.updateRecord(st);
//		st=dao.getOneStudentRecord(1l);
//		System.out.println(st);
//		System.out.println("updation done..");
		
		dao.deleteRecord(2l);
		
		
		
	}

}
