package OnetoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Question;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating object of question
		Question1 q=new Question1();
		q.setQ_id(111);
		q.setQuestion("What is java?");
		
		//creating object of answer
		Answer1 a=new Answer1();
		a.setA_id(120);
		a.setAnswer("Java is a Programming Language");
		a.setQuestion(q);
		
		Answer1 a1=new Answer1();
		a1.setA_id(130);
		a1.setAnswer("it is used in the development of softwares");
		a1.setQuestion(q);
		
		Answer1 a2=new Answer1();
		a2.setA_id(140);
		a2.setAnswer("it is the most commonly used language now a days");
		a2.setQuestion(q);
		
		//we will make a list to add all the three answers
	List<Answer1> list=new ArrayList<Answer1>();
	list.add(a);
	list.add(a1);
	list.add(a2);
	q.setAnswers(list);
		
		Session s=factory.openSession();
		Transaction tx= s.beginTransaction();
		
		
		s.save(q);
		s.save(a);
		s.save(a1);
		s.save(a2);
		
		Question1 QU=(Question1) s.get(Question1.class,111);
		System.out.println(QU.getQ_id());
		System.out.println(QU.getQuestion());
		
		//LAZY LOADING
		//when we call answer size only then answer being dispalyed 
		System.out.println(QU.getAnswers().size());
		
		
		tx.commit();
		s.close();
		factory.close();
		
//		//fetching details...
//		Question1 Q=(Question1)s.get(Question1.class, 11);
//		System.out.println(Q.getQuestion());
//		for(Answer1 A:Q.getAnswers()) {
//			System.out.println(A.getAnswer());
		
		
		}
		
	
	
	
        
        
	}


