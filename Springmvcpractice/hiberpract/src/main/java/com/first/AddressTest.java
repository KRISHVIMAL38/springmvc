package com.first;


import java.io.FileInputStream;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddressTest {
	public static void main(String[] args) throws Exception {
		System.out.println("Start of the application");
		Configuration cfg= new Configuration();
		cfg.configure();
		
		Address addr=new Address();
		addr.setAdd_id(31);
		addr.setCity("Kagal");
		addr.setStreet("Malawadi");		
		addr.setAddedDate(new Date(2024, 8, 24));
		addr.setOpen(true);
		FileInputStream fis=new FileInputStream("src/main/java/docs.png");
		byte[] data=new byte[fis.available()];
		fis.read();
		addr.setImage(data);
		
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		session.save(addr);
		tx.commit();
		session.close();
		System.out.println("we did it bro");
	}
}
