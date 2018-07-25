package demo1;

public class EmployeeImpl implements EmployeeInterface {
	private String eid, name, city;
	private double salary;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public EmployeeImpl getEmp() {
		return this;
	}

	@Override
	public String toString() {
		return eid + "\t" + name + "\t" + city + "\t" + salary;
	}
}
