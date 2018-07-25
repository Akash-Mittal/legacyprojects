package com.pack.AT.qualifier.three;

public class Bat {
private String batType;
public Bat(String batType, String batComp, double batPrice) {
	super();
	this.batType = batType;
	this.batComp = batComp;
	this.batPrice = batPrice;
}
private String batComp;
private double batPrice;

public Bat() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Bat [batType=" + batType + ", batComp=" + batComp + ", batPrice="
			+ batPrice + "]";
}
public String getBatType() {
	return batType;
}
public void setBatType(String batType) {
	this.batType = batType;
}
public String getBatComp() {
	return batComp;
}
public void setBatComp(String batComp) {
	this.batComp = batComp;
}
public double getBatPrice() {
	return batPrice;
}
public void setBatPrice(double batPrice) {
	this.batPrice = batPrice;
}
	
}
