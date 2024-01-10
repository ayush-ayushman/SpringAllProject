package com.ty.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.javaconfig.beans.Employee;
import com.ty.javaconfig.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext op=new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e=op.getBean(Employee.class);
		System.out.println(e);
		
	}

}
