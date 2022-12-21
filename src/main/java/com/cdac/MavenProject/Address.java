package com.cdac.MavenProject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

    @Entity
    @Table(name="S_address")
    public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //used for auto increment of ID column
	@Column(name="add_id")              //for changing the name of the column
    private int addressId;
	
	@Column(length=50,name="STREET")
	private String Street;
	private String city;
	
	@Transient                         //is used if we don't want to create the column for corresponding attribute
	private double x;
	
	@Column(name="add_date")
	@Temporal(TemporalType.DATE)      //used for specifying the format of date
	private Date addedDate;
	private byte[]image;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String street, String city, double x, Date addedDate, byte[] image) {
		super();
		this.addressId = addressId;
		Street = street;
		this.city = city;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	

}
