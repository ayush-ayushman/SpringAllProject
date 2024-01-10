package com.ty.sim;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	@Autowired
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

	public Person() {
		
	}

	public Person(Address address) {
		super();
		this.address = address;
	}
	
	

}
