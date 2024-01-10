package com.ty.small;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext op=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		ShipTransImpl s=op.getBean(ShipTransImpl.class);
		System.out.println(s);
		
	}

}
