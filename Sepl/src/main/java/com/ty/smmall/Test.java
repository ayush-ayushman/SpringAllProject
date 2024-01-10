package com.ty.smmall;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext op=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		Person p=op.getBean(Person.class);
		System.out.println(p);
		
		
	}

}
