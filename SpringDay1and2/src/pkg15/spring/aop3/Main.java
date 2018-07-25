package pkg15.spring.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:pkg1/spring/aop3/beans.xml");
		Programmer prog = (Programmer)context.getBean("programmerBean");
		prog.code();
		prog.runTestCases();
		prog.build();
	}
}
