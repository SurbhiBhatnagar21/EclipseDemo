package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating object of question
		Question q=new Question();
		q.setQ_id(101);
		q.setQuestion("What is java?");
		
		//creating object of answer
		Answer a=new Answer();
		a.setA_id(123);
		a.setAnswer("Java is a Programming Language");
		q.setAnswer(a);
		
		
		//creating object of question
				Question q1=new Question();
				q1.setQ_id(102);
				q1.setQuestion("What is Collection framework?");
				
				//creating object of answer
				Answer a1=new Answer();
				a1.setA_id(122);
				a1.setAnswer("API to work with objects in java");
				q1.setAnswer(a1);
				
				
				
		
		Session s=factory.openSession();
		Transaction tx= s.beginTransaction();
		
		//to save
		s.save(q);
		s.save(q1);
		s.save(a);
		s.save(a1);
		
	tx.commit();
	
	//fetching details...
	Question newQ=(Question)s.get(Question.class, 101);
	System.out.println(newQ.getQuestion());
	System.out.println(newQ.getAnswer().getAnswer());
	s.close();	
	factory.close();
	}
}
