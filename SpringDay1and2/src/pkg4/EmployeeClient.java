package pkg4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg4/beans.xml");
	/*Address add=(Address)ctx.getBean("add");
	System.out.println(add);*/
	Employee emp1=(Employee)ctx.getBean("emp");
	System.out.println(emp1);
	
	}

}
