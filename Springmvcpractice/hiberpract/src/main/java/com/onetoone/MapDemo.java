package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		
		Question question=new Question();
		question.setQuesId(1);
		question.setqDesc("What is java");
		
		Answer answer=new Answer();
		answer.setAnsId(1);
		answer.setAnsDesc("Java is oops language");
		question.setAnswer(answer);
		answer.setQuestion(question);
		
		Question question1=new Question();
		question1.setQuesId(2);
		question1.setqDesc("What is c++");
		
		Answer answer1=new Answer();
		answer1.setAnsId(2);
		answer1.setAnsDesc("C++ is hardware language");
		question1.setAnswer(answer1);
		answer1.setQuestion(question1);
		
		Transaction tx=session.beginTransaction();
		session.save(answer1);
		session.save(answer);
		session.save(question);
		session.save(question1);
		
		tx.commit();
		session.close();
		fact.close();
		
		System.out.println("We did it bro");
	}
}
