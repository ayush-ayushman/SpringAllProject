package org.jsp.come;

public class Address {
	private String streetnumber;
	private int pincode;
	private  long phoneno;
	@Override
	public String toString() {
		return "Address [streetnumber=" + streetnumber + ", pincode=" + pincode + ", phoneno=" + phoneno + "]";
	}
	public Address(String streetnumber, int pincode, long phoneno) {
		super();
		this.streetnumber = streetnumber;
		this.pincode = pincode;
		this.phoneno = phoneno;
	}
	

}
