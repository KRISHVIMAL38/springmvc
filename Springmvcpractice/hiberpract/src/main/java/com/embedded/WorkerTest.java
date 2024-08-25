package com.embedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class WorkerTest {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		
		Worker worker=new Worker();
		worker.setId(232);
		worker.setName("Krishna");
		worker.setCity("Nainital");
		
		Certi certi=new Certi();
		certi.setCourse("SpringBoot");
		certi.setDuration("12 months");
		
		worker.setCerti(certi);
		Transaction tx=session.beginTransaction();
		session.save(worker);
		//session.save(certi);
		tx.commit();
		
		session.close();
		fact.close();
		System.out.println("WE did it");
	}
}
