package com.ty.scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext op=new ClassPathXmlApplicationContext("META-INF/beans.xml  ");
		Team t=op.getBean(Team.class);
		System.out.println(t);
	}

}
