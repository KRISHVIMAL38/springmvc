package com.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentTest {
	public static void main(String[] args) throws Exception{
		System.out.println("This is the start of the application");
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory fact=cfg.buildSessionFactory();
		
		Student st=new Student();
		st.setId(232);
		st.setName("Krishna");
		st.setCompany("remote");
		
		Session session=fact.openSession();
		Transaction tx= session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
		System.out.println("Success");
		
	}
}
