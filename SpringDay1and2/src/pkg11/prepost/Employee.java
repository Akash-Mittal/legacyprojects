package pkg11.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String eid, name;
	private double salary;
	
	
	@Autowired(required=true)
	private Address address;

	@PostConstruct
	public void createEmp()
	{
		System.out.println("Post Construct in Employee");
	}
	@PreDestroy
	public void destroyEmp()
	{
		System.out.println("Pre Destroy in Employee");
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {

		return eid + "\t" + name + "\t" + salary+"\t"+address;
	}
}
