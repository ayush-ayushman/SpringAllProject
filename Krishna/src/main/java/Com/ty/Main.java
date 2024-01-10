package Com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext("Com.ty");
		Person l=con.getBean("abc",Person.class);
		l.call();
		
		
	
		
	}

}
