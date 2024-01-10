package com.ty.beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext p=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		Person t=p.getBean(Person.class);
		t.service();
		p.close();
		
	}

}
