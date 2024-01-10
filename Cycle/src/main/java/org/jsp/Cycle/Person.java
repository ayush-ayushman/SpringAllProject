package org.jsp.Cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Person {
	@PostConstruct
	public void pen()
	{
		System.out.println("hello");
	}
	public void service()
	{
		System.out.println("hello service");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("hello Pencil");
	}
	

}
