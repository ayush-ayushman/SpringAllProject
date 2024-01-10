package com.ty.beans;

public class TeamCoach implements Coach {
	private String tname;
	private String tpid;
	private String coachfor;
	
	public TeamCoach(String tname, String tpid, String coachfor) {
		super();
		this.tname = tname;
		this.tpid = tpid;
		this.coachfor = coachfor;
	}

	@Override
	public String toString() {
		return "TeamCoach [tname=" + tname + ", tpid=" + tpid + ", coachfor=" + coachfor + "]";
	}
	
}
