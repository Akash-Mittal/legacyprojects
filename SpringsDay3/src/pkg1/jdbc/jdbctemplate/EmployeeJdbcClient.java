package pkg1.jdbc.jdbctemplate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeJdbcClient 
{
	public static void main(String[] args) 
	{
		
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:pkg1/jdbc/jdbctemplate/beans.xml");
		
		EmployeesDao empDao = context.getBean("employeesDaoBean",EmployeesDao.class);
		// Add employee record
		/*empDao.addEmployee("100", "Subodh", "Delhi", 5555.66d);
		empDao.addEmployee("101", "Ram Kumar", "Noida", 444.33d);
		empDao.addEmployee("102", "gagandeep", "Pune", 666.5d);
		System.out.println("**Created Employees***");
		
		System.out.println("Total Number of Employees : " + empDao.getEmployeeCount());
		System.out.println("***List of Employees***");
		List<Employee> empList = empDao.getAllEmployees();
		for (int i = 0; i < empList.size(); i++) 
		{
			Employee emp = empList.get(i);
			System.out.println(emp.getCode() + " : " + emp.getName() + " : "+emp.getCity()+" : " + emp.getSalary());
		}
		System.out.println("***Deleting an employee***");
		//empDao.deleteEmployee(102);
		System.out.println("Total Number of Employees after deletion: " + empDao.getEmployeeCount());
		*/
		// execute batch
		List<Employee> empList1=new ArrayList<Employee>();
		empList1.add(new Employee("200","Minakshi","Delhi",333.44d));
		empList1.add(new Employee("201","Manjula","Banglore",5555.77d));
		empList1.add(new Employee("202","Gyanendra","Noida",2356.77d));
		empList1.add(new Employee("203","Anil Bahl","Delhi",3434.44d));
		empList1.add(new Employee("204","Jaya Anil","Pune",3456.54d));
		empDao.addEmployeeBatch(empList1);
		
		System.out.println("***List of Employees***");
		empList1 = empDao.getAllEmployees();
		for (int i = 0; i < empList1.size(); i++) 
		{
			Employee emp = empList1.get(i);
			System.out.println(emp.getCode() + " : " + emp.getName() + " : "+emp.getCity()+" : " + emp.getSalary());
		}
		
		// call procedure
		/*Employee empp=empDao.callProcedure("100");
		System.out.println(empp);*/
	}
}
