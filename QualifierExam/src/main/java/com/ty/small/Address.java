package com.ty.small;

public class Address {
	private String pname;
	private String paddress;
	private String id;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Address [pname=" + pname + ", paddress=" + paddress + ", id=" + id + "]";
	}
	

}
