package com.ty.beans;

public class Project {
	private String projectname;
	private String pstart;
	private String pend;
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getPstart() {
		return pstart;
	}
	public void setPstart(String pstart) {
		this.pstart = pstart;
	}
	public String getPend() {
		return pend;
	}
	public void setPend(String pend) {
		this.pend = pend;
	}
	@Override
	public String toString() {
		return "Project [projectname=" + projectname + ", pstart=" + pstart + ", pend=" + pend + "]";
	}
	

}
