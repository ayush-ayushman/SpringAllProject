package com.ty.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Value(value="${cname}")
	private String cname;
	@Value(value="${cid}")
	private int cid;
	@Value(value="${cadd}")
	private String cadd;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", cadd=" + cadd + "]";
	}
	

}
