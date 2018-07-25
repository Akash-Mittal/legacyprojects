package pkg5.ex1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpCollectionClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:pkg5/ex1/beans.xml");
		EmpCollection col=(EmpCollection)context.getBean("empColl");
		List<Employee> emp1=col.getEmpList();
		for(Employee e:emp1)
		{
			System.out.println(e);
		}
		
		System.out.println("=============");
		EmpCollection col1=(EmpCollection)context.getBean("empColl1");
		List<Employee> emp2=col1.getEmpList();
		for(Employee e:emp2)
		{
			System.out.println(e);
		}
	}

}
