package com.ty.small;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Person {
	@Autowired
	@Qualifier("address")
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Person() {
		super();
	
	}

	public Person(Address add) {
		super();
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [add=" + add + "]";
	}
	
    
	
	
	

}
