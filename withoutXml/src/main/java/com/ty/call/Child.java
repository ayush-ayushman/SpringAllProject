package com.ty.call;

import org.springframework.stereotype.Component;

@Component("child")
public class Child {
	public void caller()
	{
		System.out.println("Ayush Ayushman");
	}
	

}
