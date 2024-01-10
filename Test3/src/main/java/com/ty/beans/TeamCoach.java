package com.ty.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TeamCoach implements Coach {
	private String tname;
	private String tpid;
	private String coachfor;
	public String getTname() {
		return tname;
	}
	@Value(value="ayush")
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTpid() {
		return tpid;
	}
	@Value(value="t455")
	public void setTpid(String tpid) {
		this.tpid = tpid;
	}
	public String getCoachfor() {
		return coachfor;
	}
	@Value(value="coach")
	public void setCoachfor(String coachfor) {
		this.coachfor = coachfor;
	}
	@Override
	public String toString() {
		return "TeamCoach [tname=" + tname + ", tpid=" + tpid + ", coachfor=" + coachfor + "]";
	}
	
	
}
