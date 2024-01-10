package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.beans.CoachInfo;
import com.ty.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext op=new AnnotationConfigApplicationContext(AppConfig.class);
		CoachInfo in=op.getBean(CoachInfo.class);
		System.out.println(in);
	}
	
	

}
