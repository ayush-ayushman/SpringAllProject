package com.ty.small;

public class Person {
	private Address address;
	public void match()
	{
		address.call();
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person(Address address) {
		super();
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
