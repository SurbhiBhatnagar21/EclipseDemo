package com.cdac.MavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;

//@ Entity is used for marking a class as an entity i.e. to make a class as a table inside a database
@Entity()     //hibernate will treat a class as an entity that means hibernate will be able to fetch its objects and create a table for same.
//@Table(name="mystudents") to change the name of table


public class Student {
	
	@Id  // to make a column primary key mark it as @Id above it
	private int id;
	private String name;
	private String city;
	private Certificate certi;
	
	
	public Student(int id, String name, String city, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certi = certi;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

}
