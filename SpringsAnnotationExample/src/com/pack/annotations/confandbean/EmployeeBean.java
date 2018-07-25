package com.pack.annotations.confandbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeBean {
	
	@Bean
	public static EmployeeServiceImpl empService(){
		return new EmployeeServiceImpl();
	}
	

}
