package com.ty.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.beans.Person;

public class Test {
	public static void main(String [] args)
	{
		ApplicationContext p=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		Person p1=p.getBean(Person.class);
		System.out.println(p1);
	}

}
