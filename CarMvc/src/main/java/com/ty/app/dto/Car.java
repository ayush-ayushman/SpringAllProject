package com.ty.app.dto;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String manufacturername;
	private String carname;
	private String cartype;
	private String engine;
	private String cylinders;
	private String horsepower;
	private String torque;
	private String imageurl;
	private String seatscapacity;
	private String boot;

	public String getManufacturername() {
		return manufacturername;
	}

	public void setManufacturername(String manufacturername) {
		this.manufacturername = manufacturername;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getCylinders() {
		return cylinders;
	}

	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}

	public String getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}

	public String getTorque() {
		return torque;
	}

	public void setTorque(String torque) {
		this.torque = torque;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getSeatscapacity() {
		return seatscapacity;
	}

	public void setSeatscapacity(String seatscapacity) {
		this.seatscapacity = seatscapacity;
	}

	public String getBoot() {
		return boot;
	}

	public void setBoot(String boot) {
		this.boot = boot;
	}

}
