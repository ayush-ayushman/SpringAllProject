package com.ty;
public enum PowerState {
	OFF("the power is off"),
	ON("the power is on"),
	SUSPEND("the power usases is low");																																	
	private String description;
	private PowerState(String d)
	{
		description=d;
	}
	public String getDescription()
	{
		return description;
		
	}
	

}
