package com.ty.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoachInfo {
	private Coach coach;
	@Autowired
	public CoachInfo(@Qualifier(value="cricketCoach") Coach coach) {
		super();
		this.coach = coach;
	}
	@Override
	public String toString() {
		return "CoachInfo [coach=" + coach + "]";
	}
	
	
	
}
