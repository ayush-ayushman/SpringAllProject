package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext op=new AnnotationConfigApplicationContext("com.ty");
		Person p=op.getBean(Person.class);
		p.service();
		op.close();
		
	}
	

}
