package pkg8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee1 implements InitializingBean, DisposableBean {
	private String eid, name, city;
	private double salary;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		System.out.println(this);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("distroy");
		eid = "";
		name = "";
		city = "";
		salary = 0.0d;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {

		return eid + "\t" + name + "\t" + city + "\t" + salary;
	}
}
