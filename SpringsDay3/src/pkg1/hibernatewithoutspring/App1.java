package pkg1.hibernatewithoutspring;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class App1 {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("pkg1/hibernatewithoutspring/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sf.openSession();
		Employee emp1 = new Employee("1005", "Suman", "Singh", 333.44d);
		session.beginTransaction().begin();
		session.save(emp1);
		session.beginTransaction().commit();
		System.out.println("Inserted");
	}
}
