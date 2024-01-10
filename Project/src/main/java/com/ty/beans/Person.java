package com.ty.beans;

public class Person {
	private String name;
	private String emailId;
	private long phone;
	private Mobile mobile;
	public Person(String name, String emailId, long phone, Mobile mobile) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", emailId=" + emailId + ", phone=" + phone + ", mobile=" + mobile + "]";
	}
	
	
	

}
