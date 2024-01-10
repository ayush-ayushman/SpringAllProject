package com.ty.beans;

public class CricketCoach implements Coach {
	private String cname;
	private String cmpid;
	private String coachfor;
	
	public CricketCoach(String cname, String cmpid, String coachfor) {
		super();
		this.cname = cname;
		this.cmpid = cmpid;
		this.coachfor = coachfor;
	}

	@Override
	public String toString() {
		return "CricketCoach [cname=" + cname + ", cmpid=" + cmpid + ", coachfor=" + coachfor + "]";
	}
	
	

}
