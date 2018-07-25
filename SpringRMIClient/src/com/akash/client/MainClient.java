package com.akash.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import pkg1.Welcome;

public class MainClient {
	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/akash/client/client-beans1.xml");
	Welcome welcome = (Welcome) ctx.getBean("welcome");
	welcome.sayHello();
	welcome.welcome("Akash");
	
	}
}
