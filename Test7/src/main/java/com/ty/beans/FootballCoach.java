package com.ty.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class FootballCoach implements Coach{
	private String fpname;
	private String fpid;
	private String coachfor;
	
	public FootballCoach(@Value(value="AYUSHMAN")String fpname, 
			@Value(value="footbal4456") String fpid, 
	        @Value(value="cricket")String coachfor) {
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
