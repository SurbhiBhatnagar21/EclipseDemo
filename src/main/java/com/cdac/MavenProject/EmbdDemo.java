package com.cdac.MavenProject;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbdDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory= cfg.buildSessionFactory();
    	Student st1=new Student();
    	st1.setId(201);
    	st1.setName("John");
    	st1.setCity("Mumbai");
    	
    	
    	//creating object of certificate
        Certificate certificate=new Certificate();
        certificate.setCourse("Devops");
        certificate.setDuration("1 month");
        st1.setCerti(certificate);
        //to save data inside hibernate with the help of database
        Session s= factory.openSession();
        Transaction tx= s.beginTransaction();
        
        //to save objects
        s.save(st1);
       
        //to get changes in physical database
    	tx.commit();
    	s.close();
    	factory.close();
	}

}
