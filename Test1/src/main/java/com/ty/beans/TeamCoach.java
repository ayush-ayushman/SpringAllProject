package com.ty.beans;

public class TeamCoach implements Coach {
	private String tname;
	private String tpid;
	private String coachfor;
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTpid() {
		return tpid;
	}
	public void setTpid(String tpid) {
		this.tpid = tpid;
	}
	public String getCoachfor() {
		return coachfor;
	}
	public void setCoachfor(String coachfor) {
		this.coachfor = coachfor;
	}
	@Override
	public String toString() {
		return "TeamCoach [tname=" + tname + ", tpid=" + tpid + ", coachfor=" + coachfor + "]";
	}
	
}
