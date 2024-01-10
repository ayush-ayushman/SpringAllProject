package com.ty.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class TeamCoach implements Coach {
	private String tname;
	private String tpid;
	private String coachfor;
	
	public TeamCoach(@Value(value="abcd")String tname, 
			@Value(value="456po")String tpid, 
			@Value(value="teadmentor")String coachfor) {
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
