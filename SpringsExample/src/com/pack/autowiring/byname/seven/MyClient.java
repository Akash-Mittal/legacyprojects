package com.pack.autowiring.byname.seven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("classpath:com/pack/autowiring/byname/seven/E7Bean.xml");
	ExampleBean bean = (ExampleBean) context.getBean("bean7");
	System.out.println(bean);
	
	
}
}
