package pkg8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:pkg8/beans.xml");
	Employee1 emp1=(Employee1)ctx.getBean("emp1");
	System.out.println(emp1);
	try {
		emp1.destroy();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("========================");
	/*Employee2 emp2=(Employee2)ctx.getBean("emp2");
	System.out.println(emp2);
*/	}
}
