package org.jsp.Cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext op=new AnnotationConfigApplicationContext("org.jsp.Cycle");
        Person k= op.getBean(Person.class);
        k.service();
        op.close();
        
    }
}
