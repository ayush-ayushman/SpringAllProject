package com.ty.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.Config.AppConfig;
import com.ty.beans.Customer;

public class Test {
	public static void main(String[] args) {
		ApplicationContext op=new AnnotationConfigApplicationContext(AppConfig.class);
		Customer cus=op.getBean(Customer.class);
		System.out.println(cus); 
	}

}
