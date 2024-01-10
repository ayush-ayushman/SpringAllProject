package com.ty.entity;

public class Address {
	private String paddress;
	private String pname;
	private String pcity;
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	@Override
	public String toString() {
		return "Address [paddress=" + paddress + ", pname=" + pname + ", pcity=" + pcity + "]";
	}
	
	

}
