package pkg1.hibernatewithspring;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
EmployeeDao empdao;

public EmployeeClient() {
	
//ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:pkg1/hibernatewithspring/beans1.xml");
	
ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:pkg1/hibernatewithspring/beans1.xml");
empdao = ctx.getBean("empDao", EmployeeDao.class);
}

public void process() {
int ch1 = 0;
try {
	do {
		sop("1.Insert Records");
		sop("2.Show All Records");
		sop("3.Query Employee");
		sop("4.Update Records");
		sop("5.Delete Records");
		sop("6.Exit");

		BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in));
		sop("Enter Choice Between 1 to 5");
		int ch = Integer.parseInt(br.readLine());
		switch (ch) {
		case 1: {
			sop("Enter Employee code");
			String code = br.readLine();
			sop("enter Name ");
			String name = br.readLine();
			sop("enter city name ");
			String city = br.readLine();
			sop("enter Salary address ");
			double salary = Double.parseDouble(br.readLine());
			Employee emp = new Employee(code, name, city, salary);
			empdao.addEmployee(code, name, city, salary);
			sop("Record Inserted");
			break;
		}
		case 2: {
			List<Employee> empList = empdao.getAllEmployees();
			sop("Emp Code \t Name \t City \t Salary");
			for (Employee emp3 : empList) {
				System.out.println(emp3);
			}
			break;
		}
		case 3: {
			sop("Enter Emp code to update");
			String code = br.readLine();
			Employee emp4=empdao.queryEmployee(code);
			System.out.println(emp4);
			
			break;
		}
		case 4: {
			sop("Enter Emp code to update");
			String code = br.readLine();
			sop("Enter new salary to be update ");
			double salary = Double.parseDouble(br.readLine());
			empdao.updateSalary(code, salary);
			break;
		}
		case 5: {
			sop("Enter Emp Code to delete");
			String code = br.readLine();
			empdao.deleteSalary(code);
			break;
		}
		case 6:
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	} while (ch1 <= 6);
} catch (Exception e) {
	System.out.println(e);
} finally {
}
}

public void sop(String str) {
	System.out.println(str);
}

public static void main(String[] args) {

	new EmployeeClient().process();
}
}
