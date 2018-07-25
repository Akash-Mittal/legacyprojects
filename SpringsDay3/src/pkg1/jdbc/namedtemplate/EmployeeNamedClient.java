package pkg1.jdbc.namedtemplate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import pkg1.jdbc.jdbctemplate.Employee;

public class EmployeeNamedClient 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:pkg1/jdbc/namedtemplate/beans.xml");
		
		EmployeeNamedDao empDao = context.getBean("empNamedBean",EmployeeNamedDao.class);
		// Add employee record
		/*empDao.addEmployee("400", "Subodh", "Delhi", 5555.66d);
		empDao.addEmployee("401", "Ram Kumar", "Noida", 444.33d);
		empDao.addEmployee("402", "gagandeep", "Pune", 666.5d);
		System.out.println("**Created Employees***");*/
		
		// delete employee
		//empDao.deleteEmployee("400");
		
		System.out.println("***List of Employees***");
		List<Employee> empList = empDao.getAllEmployees();
		for (int i = 0; i < empList.size(); i++) 
		{
			Employee emp = empList.get(i);
			System.out.println(emp.getCode() + " : " + emp.getName() + " : "+emp.getCity()+" : " + emp.getSalary());
		}
		}
}
