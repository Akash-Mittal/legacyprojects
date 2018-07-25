package pkg1.hibernatewithoutspring;

import java.io.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class EmployeeClient {
	int ch1 = 0;
	Session session = null;
	SessionFactory sessionfactory;

public EmployeeClient() {
	try {
		sessionfactory = new Configuration().configure("pkg1/hibernatewithoutspring/hibernate.cfg.xml").buildSessionFactory();
		sop("Session Factory Obtained");
	} catch (HibernateException e) {
		e.printStackTrace();
	}
}

public void processTask() {
try {
	do {
		session = sessionfactory.openSession();
		sop("1.Insert Records");
		sop("2.Select Records");
		sop("3.Update Records");
		sop("4.Delete Records");
		sop("5.Exit");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sop("Enter Choice Between 1 to 5");
		int ch = Integer.parseInt(br.readLine());

		switch (ch) {
		case 1: {
			sop("Session Open");
			sop("Enter Employee code");
			String code = br.readLine();
			sop("enter Name ");
			String name = br.readLine();
			sop("enter city name ");
			String city = br.readLine();
			sop("enter Salary address ");
			double salary = Double.parseDouble(br.readLine());
			Employee emp = new Employee(code, name, city, salary);
			session.beginTransaction().begin();
			session.save(emp);
			session.beginTransaction().commit();
			sop("Record Inserted");
			session.flush();
			session.close();
			break;
		}
		case 2: {
			String rec = "display whole record from Employee";
			Query q = session.createQuery("from Employee");
			Iterator ii = q.iterate();
			sop("Emp Code \t Name \t City \t Salary");
			while (ii.hasNext()) 
			{
			Employee emp3 = (Employee) ii.next();
			sop(emp3.getCode() + "\t" + emp3.getName() + "\t"+ emp3.getCity() + "\t" + emp3.getSalary());
			}
			session.flush();
			session.close();
			break;
		}
		case 3: {
			sop("Enter Emp code to update");
			String empCode = br.readLine();
			Employee ee1 = (Employee) session.get(Employee.class, empCode);
			sop("Enter new salary to be update ");
			int newSalary = Integer.parseInt(br.readLine());
			ee1.setSalary(ee1.getSalary()+newSalary);
			session.update(ee1);
			session.flush();
			session.close();
			break;
		}
		case 4: {
			sop("Enter Emp Code to delete");
			String empCode = br.readLine(); 
			Employee ee2 = (Employee) session.get(Employee.class,empCode);
			session.delete(ee2);
			session.flush();
			session.close();
			break;
		}
		case 5:
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	} while (ch1 <= 5);
} catch (Exception e) {
	System.out.println(e);
} finally {
}
}

public void sop(String str) {
	System.out.println(str);
}

public static void main(String[] args) {
	new EmployeeClient().processTask();

}
}