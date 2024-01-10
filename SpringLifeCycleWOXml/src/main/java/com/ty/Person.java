package com.ty;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Person {
  @PostConstruct
  public void init()
  {
	   System.out.println("initialization is done");
	  
  }
  public void service()
  {
	  System.out.println("Business Logic");
  }
  @PreDestroy
  public void destroy()
  {
	  System.out.println("Destroy");
  }
}
