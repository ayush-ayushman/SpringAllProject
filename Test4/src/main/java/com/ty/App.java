package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.beans.CoachInfo;

public class App {
	public static void main(String[] args) {
		ApplicationContext op=new AnnotationConfigApplicationContext("META-INF/beans.xml");
		CoachInfo in=op.getBean(CoachInfo.class);
		System.out.println(in);
	}
	
	

}
