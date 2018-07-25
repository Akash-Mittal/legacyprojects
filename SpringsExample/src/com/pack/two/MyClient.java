package com.pack.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("classpath:com/pack/two/E2Bean.xml");
		Employee emp = (Employee) context.getBean("emp2");
		System.out.println(emp);
	}
	

	
}
