package com.RestAPIdto.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class StudentDTO {

	private int id;
	@NotNull
	@Size(min=3,max=50,message="Name should be between3-50 characters")
	private String name;
	@Size(min=10,max=50,message="Address should be between3-50 characters")
	private String address;
	@NotNull
	@Size(min=10,max=13,message="Phoneno should be between 0-13 characters")
	private String phoneno;

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