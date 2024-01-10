package com.ty.see;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value="${name}")
	private String sname;
	@Value(value="${id}")
	private int id;
	@Value(value="${address}")
	private String saddress;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", id=" + id + ", saddress=" + saddress + "]";
	}
	

}
