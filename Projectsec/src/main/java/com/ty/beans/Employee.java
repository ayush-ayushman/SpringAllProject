package com.ty.beans;

public class Employee {
	private String ename;
	private int eid;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + "]";
	}
	
	

}
