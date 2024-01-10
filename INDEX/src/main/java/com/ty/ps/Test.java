package com.ty.ps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext op=new ClassPathXmlApplicationContext();
		Student st=op.getBean(Student.class);
	}

}
