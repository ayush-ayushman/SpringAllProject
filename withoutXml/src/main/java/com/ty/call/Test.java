package com.ty.call;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
	 ApplicationContext p=new AnnotationConfigApplicationContext(Student.class);
	 Person st=p.getBean(Person.class);
	 Child c=p.getBean(Child.class);
	 Anagha l=p.getBean("ana",Anagha.class);
	 l.tell();
	 st.per();
	 c.caller();
	 ApplicationContext p1=new AnnotationConfigApplicationContext("com.ty.call");
	 Person st1=p1.getBean(Person.class);
	 Child c1=p1.getBean(Child.class);
	 st1.per();
	 c1.caller();
	}

}
