package pkg1.hibernatewithspring.ex1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	private String code;
	private String name;
	private String city;
	private double salary;

	public Employee() {

	}

	public Employee(String code, String name, String city, double salary) {
		super();
		this.code = code;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {

		return code + "\t" + name + "\t" + city + "\t" + salary;
	}
}