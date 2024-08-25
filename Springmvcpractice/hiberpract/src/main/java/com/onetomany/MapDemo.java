package com.onetomany;

import java.util.ArrayList;
import java.util.List;

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
		Question1 question=new Question1();
		question.setQuestId(1);
		question.setQuesDesc("What is HTML");
		
		Answer1 answer=new Answer1();
		answer.setAnsId(1);
		answer.setAnsDesc("Java is programming language");
		answer.setQuestion(question);
		
		Answer1 answer1=new Answer1();
		answer1.setAnsId(2);
		answer1.setAnsDesc("Java is platform indepemndent language");
		answer1.setQuestion(question);
		
		List<Answer1>list=new ArrayList<Answer1>();
		list.add(answer1);
		list.add(answer);
		
		question.setAnswer(list);
		
		Transaction tx=session.beginTransaction();
		session.save(answer1);
		session.save(answer);
		session.save(question);
		
		tx.commit();
		session.close();
		fact.close();
		
		System.out.println("We did it bro");
	}
}
