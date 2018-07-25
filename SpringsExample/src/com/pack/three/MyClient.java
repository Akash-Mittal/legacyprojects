package com.pack.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {
	public static void main(String[] args) {
		// How to use our own object inside employe Class
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/pack/three/E3bean.xml");
		Employee employee = (Employee) context.getBean("emp3");
		System.out.println(employee);
	}

}
