package org.jsp.come;

public class Person {
	private String pname;
	private int pid;
	
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	

}
