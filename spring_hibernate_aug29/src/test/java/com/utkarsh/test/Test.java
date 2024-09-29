package com.utkarsh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.utkarsh01.entity.Student;


public class Test {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		
		config.configure("/hibernate.cfg.xml");
		
		SessionFactory factory=config.buildSessionFactory();
		
		Session sess=factory.openSession();
		
		Transaction tx=sess.beginTransaction();
		
		Student st=new Student(1, "Rama", "Dev", 50.26);
		
		sess.save(st);
		
		tx.commit();
		
		sess.clear();
		
	}

}
