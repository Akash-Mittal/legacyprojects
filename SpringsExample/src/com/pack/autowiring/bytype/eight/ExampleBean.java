package com.pack.autowiring.bytype.eight;

public class ExampleBean {
private Bean1 b1;
private Bean2 b2;
public Bean1 getB1() {
	return b1;
}
public void setB1(Bean1 b1) {
	this.b1 = b1;
}
public Bean2 getB2() {
	return b2;
}
public void setB2(Bean2 b2) {
	this.b2 = b2;
}
@Override
public String toString() {
	return "ExampleBean [b1=" + b1 + ", b2=" + b2 + "]";
}


	
}
