package pkg9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pkg2.Employee;

public class MessageClient {
	public static void main(String[] args) {
	 //ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg9/final.xml");
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"classpath:pkg9/bean1.xml","classpath:pkg9/bean2.xml","classpath:pkg9/bean3.xml"});
Message1 m1=(Message1)ctx.getBean("m1");
Message2 m2=(Message2)ctx.getBean("m2");
Message3 m3=(Message3)ctx.getBean("m3");
System.out.println(m1.getMessage1());
System.out.println(m2.getMessage2());
System.out.println(m3.getMessage3());
	}
}
