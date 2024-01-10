package com.ty.bean;

public class Finance implements Department {
	private String empname;
	private String empid;
	private String jobDes;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getJobDes() {
		return jobDes;
	}
	public void setJobDes(String jobDes) {
		this.jobDes = jobDes;
	}
	@Override
	public String toString() {
		return "Finance [empname=" + empname + ", empid=" + empid + ", jobDes=" + jobDes + "]";
	}
	
   
}
