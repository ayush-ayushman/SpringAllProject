package com.ty.sec;

import java.util.Map;

public class Minister {
	Map<String,String > map;

	@Override
	public String toString() {
		return "Minister [map=" + map + "]";
	}

	public Minister(Map<String, String> map) {
		super();
		this.map = map;
	}
	

}
