package org.jsp.time;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Ayush Ayushman")
	private String sname;
	@Value("NewDelhi")
	private String saddress;
	@Value("#{my}")
	private List<Long> sphone;
	public List<Long> getSphone() {
		return sphone;
	}
	public void setSphone(List<Long> sphone) {
		this.sphone = sphone;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", saddress=" + saddress + ", sphone=" + sphone + "]";
	}
	
	
	

}
