package com.ty.controller;

import java.util.Date;
import java.util.List;

import com.ty.entity.Address;

public class UserDetails {
	private String customername;
	private String phonenumber;
	private String emailaddress;
	private List<String> taxi;
	private List<String> extras;
	private String pickupdate;
	private String pickupplace;
	private String dropoffplace;
	private String comment;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public List<String> getTaxi() {
		return taxi;
	}
	public void setTaxi(List<String> taxi) {
		this.taxi = taxi;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	public String getPickupdate() {
		return pickupdate;
	}
	public void setPickupdate(String pickupdate) {
		this.pickupdate = pickupdate;
	}
	public String getPickupplace() {
		return pickupplace;
	}
	public void setPickupplace(String pickupplace) {
		this.pickupplace = pickupplace;
	}
	public String getDropoffplace() {
		return dropoffplace;
	}
	public void setDropoffplace(String dropoffplace) {
		this.dropoffplace = dropoffplace;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "UserDetails [customername=" + customername + ", phonenumber=" + phonenumber + ", emailaddress="
				+ emailaddress + ", taxi=" + taxi + ", extras=" + extras + ", pickupdate=" + pickupdate
				+ ", pickupplace=" + pickupplace + ", dropoffplace=" + dropoffplace + ", comment=" + comment
				+ ", address=" + address + "]";
	}
	
	

}
