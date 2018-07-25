package pkg8;


public class Employee2 {
	private String eid, name, city;
	private double salary;


	public void init(){
		System.out.println("init method");
		System.out.println(this);
	}

	
	public void destroy(){
		System.out.println("distroy method");
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
