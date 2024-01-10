package com.ty.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	private String cname;
	private String cmpid;
	private String coachfor;
	
	public CricketCoach(@Value(value="Ayush")String cname,
			          @Value(value="st123")String cmpid,
			          @Value(value="cricket")String coachfor) {
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
