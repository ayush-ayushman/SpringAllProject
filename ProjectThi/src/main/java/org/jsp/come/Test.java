package org.jsp.come;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String [] args) {
	ApplicationContext op=new ClassPathXmlApplicationContext("META-INF/beans.xml");
	Person p=op.getBean(Person.class);
	System.out.println(p);
  }

}
