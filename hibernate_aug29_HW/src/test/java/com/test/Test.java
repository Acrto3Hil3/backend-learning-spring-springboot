package com.test;

import com.utkarsh01.dao.StudentDao;
import com.utkarsh01.dao.StudentDaoImpl;
import com.utkarsh01.entity.StudentRecord;

public class Test {

	public static void main(String[] args) {
		
		StudentDao dao=new StudentDaoImpl();
		
		StudentRecord st=new StudentRecord("Shiva","Kumar",963852369l,"Sr Nagar");
		dao.storeRecord(st);
		System.out.println(st);
		System.out.println("Details saved successfully");

	}

}
