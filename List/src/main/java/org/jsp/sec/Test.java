package org.jsp.sec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String [] args)
	{
		ApplicationContext op=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		First f=op.getBean(First.class);
		System.out.println(f);
	}

}
