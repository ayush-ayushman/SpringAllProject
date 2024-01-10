package com.ty.beans;

public class CricketCoach implements Coach {
	private String cname;
	private String cmpid;
	private String coachfor;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmpid() {
		return cmpid;
	}
	public void setCmpid(String cmpid) {
		this.cmpid = cmpid;
	}
	public String getCoachfor() {
		return coachfor;
	}
	public void setCoachfor(String coachfor) {
		this.coachfor = coachfor;
	}
	@Override
	public String toString() {
		return "CricketCoach [cname=" + cname + ", cmpid=" + cmpid + ", coachfor=" + coachfor + "]";
	}
	
	

}
