package pkg11.scancomp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg11/scancomp/beans.xml");
	Employee1 emp1 = ctx.getBean(Employee1.class);
	System.out.println(emp1);
	/*Employee2 emp2 = ctx.getBean(Employee2.class);
	System.out.println(emp2);*/
	}

}
