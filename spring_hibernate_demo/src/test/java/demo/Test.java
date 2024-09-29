package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.utkarsh.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction tx=sess.beginTransaction();
		Student st=new Student(2,"Shiva","Math",50.45);
//		sess.persist(st);
		sess.save(st);
		tx.commit();
		sess.close();
		
	}

}
