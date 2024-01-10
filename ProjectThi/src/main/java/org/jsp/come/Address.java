package org.jsp.come;

public class Address {
	private String streetnumber;
	private int pincode;
	private  long phoneno;
	public String getStreetnumber() {
		return streetnumber;
	}
	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Address [streetnumber=" + streetnumber + ", pincode=" + pincode + ", phoneno=" + phoneno + "]";
	}
	

}
