package pkg15.aop.annotation.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:pkg15/aop/annotation/aspectj/beans.xml");
		Programmer prog = (Programmer) context.getBean("programmerBean");
		/*System.out.println("***Class generated : " + prog.getClass().getName());
		System.out.println("***Base Class is : " + prog.getClass().getSuperclass().getName());*/

		 prog.setCategory("Module Lead");
		
		System.out.println();
		prog.code();
		prog.runTestCases();
		prog.modifyUseCases();
	}
}
