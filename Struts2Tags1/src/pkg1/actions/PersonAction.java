package pkg1.actions;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport{
	String name;
	String address;
	String city;		
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String execute(){
		setName("Subodh Sharma");
		setAddress("B-26, Sector-57");
		setCity("Noida");		
		return SUCCESS;
	}
}
