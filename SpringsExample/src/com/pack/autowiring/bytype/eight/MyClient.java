package com.pack.autowiring.bytype.eight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("classpath:com/pack/autowiring/bytype/eight/EBean.xml");
	ExampleBean bean = (ExampleBean) context.getBean("bean8");
	System.out.println(bean);
	
	
}
}
