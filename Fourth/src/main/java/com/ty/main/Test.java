package com.ty.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext op=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		Person p1=op.getBean(Person.class);
		System.out.println(p1);
		Person p2=op.getBean(Person.class);
		System.out.println(p2);
		Person p3=op.getBean(Person.class);
		System.out.println(p3);
		Person p4=op.getBean(Person.class);
		System.out.println(p4);
	}

}
