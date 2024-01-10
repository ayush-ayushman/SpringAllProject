package com.ty.call;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ty.call")
public class Student {
	@Bean
	public Anagha ana()
	{
	  Anagha a=new Anagha();
		return a;
	}

}
