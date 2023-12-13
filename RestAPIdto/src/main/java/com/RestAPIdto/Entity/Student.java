package com.RestAPIdto.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_List")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="S_ID")
	private int id;
	@Column(name="S_NAME",length=50)
	private String name;
	@Column(name="S_ADDRESS",length=100)
	private String address;
	@Column(name="S_PHONE.NO",length=10,unique=true)
	private String phoneno;
	public Student() {
		super();
	}
	public Student(int id, String name, String address, String phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
}
