package com.ty.sec;

import java.util.Map;

public class PhoneBook {
	Map<String, Long> map;

	public PhoneBook(Map<String, Long> map) {
		super();
		this.map = map;
	}

	@Override
	public String toString() {
		return "PhoneBook [map=" + map + "]";
	}
	
	

}
