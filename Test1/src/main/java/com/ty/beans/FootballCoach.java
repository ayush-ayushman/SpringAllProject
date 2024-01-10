package com.ty.beans;

public class FootballCoach implements Coach{
	private String fpname;
	private String fpid;
	private String coachfor;
	public String getFpname() {
		return fpname;
	}
	public void setFpname(String fpname) {
		this.fpname = fpname;
	}
	public String getFpid() {
		return fpid;
	}
	public void setFpid(String fpid) {
		this.fpid = fpid;
	}
	public String getCoachfor() {
		return coachfor;
	}
	public void setCoachfor(String coachfor) {
		this.coachfor = coachfor;
	}
	@Override
	public String toString() {
		return "FootballCoach [fpname=" + fpname + ", fpid=" + fpid + ", coachfor=" + coachfor + "]";
	}
	
	
}
