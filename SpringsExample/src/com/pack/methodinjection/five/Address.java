package com.pack.methodinjection.five;

public class Address {
	private int houseNumber;
	private String city;
	
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", city=" + city + "]";
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
