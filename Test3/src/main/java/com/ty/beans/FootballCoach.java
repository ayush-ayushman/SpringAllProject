package com.ty.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
	private String fpname;
	private String fpid;
	private String coachfor;
	public String getFpname() {
		return fpname;
	}
	@Value(value="Ayush")
	public void setFpname(String fpname) {
		this.fpname = fpname;
	}
	public String getFpid() {
		return fpid;
	}
	@Value(value="s123")
	public void setFpid(String fpid) {
		this.fpid = fpid;
	}
	public String getCoachfor() {
		return coachfor;
	}
	@Value(value="football")
	public void setCoachfor(String coachfor) {
		this.coachfor = coachfor;
	}
	@Override
	public String toString() {
		return "FootballCoach [fpname=" + fpname + ", fpid=" + fpid + ", coachfor=" + coachfor + "]";
	}
	
	
	
}
