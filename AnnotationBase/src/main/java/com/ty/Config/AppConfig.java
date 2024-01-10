package com.ty.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.ty.beans")
@PropertySource(value="classpath:META-INF/log.properties")
public class AppConfig {

}
