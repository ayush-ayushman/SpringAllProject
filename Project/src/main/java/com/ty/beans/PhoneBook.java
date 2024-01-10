package com.ty.beans;

import java.util.Map;

public class PhoneBook {
	Map<String,Long> contact;

	public PhoneBook(Map<String, Long> contact) {
		super();
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "PhoneBook [contact=" + contact + "]";
	}
	

}
