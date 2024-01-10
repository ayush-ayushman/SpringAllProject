package com.ty.small;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext op=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		Person p=op.getBean("person",Person.class);
		System.out.println(p);
	}

}
