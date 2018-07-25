package pkg15.spring.aspectj.aop4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:pkg1/spring/aspectj/aop4/beans.xml");
		Programmer prog = (Programmer) context.getBean("programmerBean");
		System.out.println("***Class generated : " + prog.getClass().getName());
		System.out.println("***Base Class is : " + prog.getClass().getSuperclass().getName());
	
		System.out.println();
		prog.code();
		prog.runTestCases();
		prog.build();
	}
}
