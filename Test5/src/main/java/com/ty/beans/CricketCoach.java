package com.ty.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	private String cname;
	private String cmpid;
	private String coachfor;
	public String getCname() {
		return cname;
	}
	@Value(value="ayush")
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmpid() {
		return cmpid;
	}
	@Value(value="cri456")
	public void setCmpid(String cmpid) {
		this.cmpid = cmpid;
	}
	public String getCoachfor() {
		return coachfor;
	}
	@Value(value="cricket")
	public void setCoachfor(String coachfor) {
		this.coachfor = coachfor;
	}
	@Override
	public String toString() {
		return "CricketCoach [cname=" + cname + ", cmpid=" + cmpid + ", coachfor=" + coachfor + "]";
	}
	
	

}
