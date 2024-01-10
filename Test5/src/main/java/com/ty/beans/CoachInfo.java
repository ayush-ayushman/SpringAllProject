package com.ty.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class CoachInfo {
	@Autowired
	@Qualifier(value="cricketCoach")
	private Coach coach;
	

	public Coach getCoach() {
		return coach;
	}


	public void setCoach(Coach coach) {
		this.coach = coach;
	}


	@Override
	public String toString() {
		return "CoachInfo [coach=" + coach + "]";
	}
	

}
