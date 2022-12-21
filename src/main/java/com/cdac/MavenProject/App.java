package com.cdac.MavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )throws IOException
    
    
    {
    	System.out.println("Project started...");
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory= cfg.buildSessionFactory();
    
    	//creating object of student
    	Student st=new Student();
    	st.setId(102);
    	st.setName("Jack");
    	st.setCity("Goa");
    	System.out.println(st);
    	
    	//creating object of address class
    	Address ad=new Address();
    	ad.setStreet("street1");
    	ad.setCity("Delhi");
    	ad.setAddedDate(new Date());
    	ad.setX(1021.2);
    	
    	//reading image
    	FileInputStream fis= new FileInputStream("src/main/java/images.jpg");
    	byte[] data=new byte[fis.available()];
    	fis.read(data);
    	ad.setImage(data);
    	
   Session session=factory.openSession();
   
   session.beginTransaction();//Transaction tx=session.beginTransaction();
   session.save(st);
   session.save(ad);
   
   
   session.getTransaction().commit();//tx.commit()
    	
    	
    	session.close();
    }
}
