package com.ty.call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Autowired
	private Address add;
	public void match()
	{
		add.call();
	}
	
	

}
