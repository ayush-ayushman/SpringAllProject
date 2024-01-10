package com.ty.app.entities;

import org.springframework.stereotype.Component;

@Component
public class BillOperator {
	private String boId;
	private String boName;
	private String boemail;
	private String bophone;
	private String boaddress;
	private String bopassword;

	

	public String getBoId() {
		return boId;
	}

	public void setBoId(String boId) {
		this.boId = boId;
	}

	public String getBoName() {
		return boName;
	}

	public void setBoName(String boName) {
		this.boName = boName;
	}

	public String getBoemail() {
		return boemail;
	}

	public void setBoemail(String boemail) {
		this.boemail = boemail;
	}

	public String getBophone() {
		return bophone;
	}

	public void setBophone(String bophone) {
		this.bophone = bophone;
	}

	public String getBoaddress() {
		return boaddress;
	}

	public void setBoaddress(String boaddress) {
		this.boaddress = boaddress;
	}

	public String getBopassword() {
		return bopassword;
	}

	public void setBopassword(String bopassword) {
		this.bopassword = bopassword;
	}

}
