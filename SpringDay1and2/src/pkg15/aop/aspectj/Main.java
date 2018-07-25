package pkg15.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("E:/AllWorkSpace/Spring/SpringWk/SpringAop/src/pkg1/aop/aspectj/beans.xml");
		Programmer prog = (Programmer) context.getBean("programmerBean");
		System.out.println("***Class generated : " + prog.getClass().getName());
		System.out.println("***Base Class is : " + prog.getClass().getSuperclass().getName());
	
		System.out.println();
		prog.code();
		prog.runTestCases();
		prog.build();
	}
}
