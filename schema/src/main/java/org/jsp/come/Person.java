package org.jsp.come;

public class Person {
	private String pname;
	private Address address;
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", address=" + address + "]";
	}
	public Person(String pname, Address address) {
		super();
		this.pname = pname;
		this.address = address;
	}
	

}
