package com.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		
		Student student=(Student)session.get(Student.class, 233);
		//Student student2=(Student)session.load(Student.class, 233);
		/*
		 * System.out.println("id = "+student.getId());
		 * System.out.println("name = "+student.getName());
		 * System.out.println("company = "+student.getCompany());
		 */
		
		//System.out.println(student2);
		session.close();
		fact.close();
	}
}
