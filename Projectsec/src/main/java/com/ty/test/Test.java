package com.ty.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.beans.Employee;
import com.ty.beans.Project;

public class Test {
	public static void main(String [] args)
	{
		 ApplicationContext op=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		 Project p=op.getBean(Project.class);
		 Employee e=op.getBean(Employee.class);
		 System.out.println(p);
		 System.out.println(e);
		 
		
	}

}
