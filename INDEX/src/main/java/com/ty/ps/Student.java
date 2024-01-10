package com.ty.ps;

public class Student {
	private String sname;
	private long sno;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getSno() {
		return sno;
	}
	public void setSno(long sno) {
		this.sno = sno;
	}
	public Student(String sname, long sno) {
		super();
		this.sname = sname;
		this.sno = sno;
	}
	

}
