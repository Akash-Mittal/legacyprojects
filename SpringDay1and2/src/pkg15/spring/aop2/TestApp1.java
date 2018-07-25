package pkg15.spring.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestApp1 {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"classpath:pkg1/spring/aop2/beans.xml");
		MessageBean bean1 = (MessageBean) ctx.getBean("messageBean");
		bean1.execute();
	}
}
