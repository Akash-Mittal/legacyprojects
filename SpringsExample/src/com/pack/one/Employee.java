package com.pack.one;

public class Employee {
	private int employeid;
	private String employname;
	public int getEmployeid() {
		return employeid;
	}
	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}
	public String getEmployname() {
		return employname;
	}
	public void setEmployname(String employname) {
		this.employname = employname;
	}
	@Override
	public String toString() {
		return "Example1 [employeid=" + employeid + ", employname="
				+ employname + "]";
	}
	

}
