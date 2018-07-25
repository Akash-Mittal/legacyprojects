package pkg1.jndidemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client 
{
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:pkg1/jndidemo/beans.xml");
		EmpDao empdao = (EmpDao) ctx.getBean("empDao");
		empdao.create("a0001", "Ram", "Noida", 4444);
		System.out.println("Inserted");
	}
}
