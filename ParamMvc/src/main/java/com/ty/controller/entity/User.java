package com.ty.controller.entity;
public class User {
	private String nm;
	private String add;
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "User [nm=" + nm + ", add=" + add + "]";
	}
	
	

}
