package pkg3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pkg1.Message;

public class MultipleConfigurationFile {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "classpath:pkg1/beans.xml",
						"classpath:pkg3/beans.xml" });
		Employee emp1 = (Employee) ctx.getBean("emp");
		System.out.println(emp1);
		Message message = (Message) ctx.getBean("msgObj");
		message.sayHello();
	}

}
