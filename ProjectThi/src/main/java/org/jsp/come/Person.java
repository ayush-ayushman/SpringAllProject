package org.jsp.come;

public class Person {
	private String pname;
	private Address address;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", address=" + address + "]";
	}
	
	

}
