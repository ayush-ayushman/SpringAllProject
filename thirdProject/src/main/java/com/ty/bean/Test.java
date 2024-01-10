package com.ty.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args) {
	ApplicationContext op=new ClassPathXmlApplicationContext("META-INF/beans.xml");
	 DeptInfo d=op.getBean(DeptInfo.class);
	 System.out.println(d);
}

}
