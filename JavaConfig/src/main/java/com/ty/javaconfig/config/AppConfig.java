package com.ty.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ty.javaconfig.beans.Employee;

@Configuration
public class AppConfig {
	@Bean
	public Employee getEmployee()
	{
		return new Employee();
	}

}
