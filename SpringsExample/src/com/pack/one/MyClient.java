package com.pack.one;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class MyClient {
public static void main(String[] args) {
	// Example of Usings How to Use Bean Fractory
	Resource res = new ClassPathResource("com/pack/one/E1Bean1.xml");
	BeanFactory bean = new XmlBeanFactory(res);
	Employee emp = (Employee) bean.getBean("emp1");
	System.out.println(emp.toString());
}
	
	
	
	


}
