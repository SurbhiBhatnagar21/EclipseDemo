package com.cdac.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		//fetching data with the help of get and load method
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory= cfg.buildSessionFactory();
    	
    	Session session =factory.openSession();
    	
    	//get method-student 102
    	Student std=(Student)session.get(Student.class, 102);
    	System.out.println(std);
    	
    	
    	//load method
    	Student st=(Student)session.load(Student.class, 102);
    	System.out.println(st);

    	
    	
    	Address ad=(Address)session.get(Address.class,1);
    	System.out.println(ad.getStreet()+":"+ad.getCity());
    
    	session.close();
    	factory.close();

	}

}
