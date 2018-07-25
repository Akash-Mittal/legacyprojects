package pkg11.scancomp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee2 {
	private String eid;
	private double salary;
	private Name name;
	private Address address;

	@Autowired(required = true)
	public Employee2(@Qualifier("name2") Name name, @Qualifier("address1") Address address) {
		super();
		this.name = name;
		this.address = address;
		eid="A003";
		salary=666.88d;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
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

		return eid + "\t" + "\t" + salary + "\t" + "\n" + name + "\t" + address;
	}
}
