package com.utkarsh01.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.utkarsh01.entity.Student;

public class StudentDaoImp implements StudentDao {

	private static Session sess=null;
	
	static {
		Configuration config=new Configuration();
		config.configure("/hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		sess=factory.openSession();
	}
	
	@Override
	public void getAllStudentRecords(Student st) {
	Transaction tx=sess.beginTransaction();
	sess.persist(st);
	tx.commit();
	}

	@Override
	public void updateRecord(Student st) {
		Transaction tx=sess.beginTransaction();
		sess.persist(st); // work as if id found then it update else it create 
		tx.commit();
	}

	@Override
	public void deleteRecord(Long id) {
		Transaction tx=sess.beginTransaction();
		Student st=getOneStudentRecord(id);
		sess.remove(st);
		tx.commit();
	}

	@Override
	public Student getOneStudentRecord(Long id) {
				Student st=sess.get(Student.class, id);
				//get() return the object by fetching it from db or hibernate cache.
				// load() just return the refernce of bject that might not exit.
				return st;
	}
	

}
