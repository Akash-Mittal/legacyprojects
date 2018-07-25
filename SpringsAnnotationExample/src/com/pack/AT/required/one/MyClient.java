package com.pack.AT.required.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pack/AT/required/one/ATE1Bean.xml");
		Employee emp = (Employee) context.getBean("emp1");
		System.out.println(emp);
	}
}
