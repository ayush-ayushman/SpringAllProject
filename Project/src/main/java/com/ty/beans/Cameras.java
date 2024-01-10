package com.ty.beans;

public class Cameras {
	private String megafixal;
	private String manufact;
	private String focallength;
	public Cameras(String megafixal, String manufact, String focallength) {
		super();
		this.megafixal = megafixal;
		this.manufact = manufact;
		this.focallength = focallength;
	}
	@Override
	public String toString() {
		return "Cameras [megafixal=" + megafixal + ", manufact=" + manufact + ", focallength=" + focallength + "]";
	}
	
	

}
