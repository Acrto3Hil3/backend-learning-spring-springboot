package com.utkarsh01.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.utkarsh01.entity.StudentRecord;

public class StudentDaoImpl implements StudentDao {
	
private static Session sess=null;
	
	static {
		Configuration config=new Configuration();
		config.configure("/hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		sess=factory.openSession();
	}

	@Override
	public void storeRecord(StudentRecord st) {
		Transaction tx=sess.beginTransaction();
		sess.persist(st);
		tx.commit();
	}

	@Override
	public void updateRecord(StudentRecord st) {
		Transaction tx=sess.beginTransaction();
		sess.persist(st);
		tx.commit();
	}

	@Override
	public StudentRecord getOneRecord(Integer id) {		
		StudentRecord st=sess.get(StudentRecord.class, id);
		return st;
	}

	@Override
	public void deleteRecord(Integer id) {
		Transaction tx=sess.beginTransaction();
		StudentRecord st=getOneRecord(id);
		sess.remove(st);
		tx.commit();
	}
	
}
