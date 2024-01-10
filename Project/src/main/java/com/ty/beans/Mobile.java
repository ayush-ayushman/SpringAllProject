package com.ty.beans;

import java.util.List;
import java.util.Map;

public class Mobile {
	private String mname;
	private String processor;
	private List<Cameras> cameras;
	private String battery;
	private PhoneBook phonebook;
	@Override
	public String toString() {
		return "Mobile [mname=" + mname + ", processor=" + processor + ", cameras=" + cameras + ", battery=" + battery
				+ ", phonebook=" + phonebook + "]";
	}
	public Mobile(String mname, String processor, List<Cameras> cameras, String battery, PhoneBook phonebook) {
		super();
		this.mname = mname;
		this.processor = processor;
		this.cameras = cameras;
		this.battery = battery;
		this.phonebook = phonebook;
	}
	
	
	

}
