package com.ty.beans;

public class CoachInfo {
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
