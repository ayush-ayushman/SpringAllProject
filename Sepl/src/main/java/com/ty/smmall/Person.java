package com.ty.smmall;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("#{11+22+33+44+55}")
	private int x;
	@Value("#{10+20+30+40+50}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	@Value("#{T(java.lang.Math).PI}")
	private double l;
	@Value("#{new java.lang.String('Anagha Ramesh')}")
	private String name;
	@Value("#{8-6>3}")
	private boolean active;
	

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Person [x=" + x + ", y=" + y + ", z=" + z + ", l=" + l + ", name=" + name + ", active=" + active + "]";
	}

	
}
