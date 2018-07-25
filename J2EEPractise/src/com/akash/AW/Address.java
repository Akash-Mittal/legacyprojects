package com.akash.AW;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Address {

private String address;
public Address() {
	// TODO Auto-generated constructor stub
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Address(String address) {
	super();
	this.address = address;
}
@Override
public String toString() {
	return "Address [address=" + address + "]";
}
	

}

