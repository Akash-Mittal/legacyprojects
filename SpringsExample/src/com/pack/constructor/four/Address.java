package com.pack.constructor.four;

public class Address {
private int city;	
private int pincode;
public int getCity() {
	return city;
}
public void setCity(int city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", pincode=" + pincode + "]";
} 
}
