package com.ty.beans;

public class FootballCoach implements Coach{
	private String fpname;
	private String fpid;
	private String coachfor;
	
	public FootballCoach(String fpname, String fpid, String coachfor) {
		super();
		this.fpname = fpname;
		this.fpid = fpid;
		this.coachfor = coachfor;
	}

	@Override
	public String toString() {
		return "FootballCoach [fpname=" + fpname + ", fpid=" + fpid + ", coachfor=" + coachfor + "]";
	}
	
	
}
