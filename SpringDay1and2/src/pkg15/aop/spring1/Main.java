package pkg15.aop.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new FileSystemXmlApplicationContext("E:/AllWorkSpace/Spring/SpringWk/SpringAop/src/pkg1/aop/spring1/beans.xml");
		Programmer prog = (Programmer)context.getBean("programmerBean");
		prog.code();
		prog.runTestCases();
		prog.build();
	}
}
