package com.akash.AOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	private String userName;
	private String userAddress;
	private Boolean isVerified;
	private Boolean offLine;
	public User() {
		this.userName = null;
		this.userAddress = null;
		this.isVerified = false;
		this.offLine = true;
	}
	public User(String userName, String userAddress, Boolean isVerified,
			Boolean offLine) {
		super();
		this.userName = userName;
		this.userAddress = userAddress;
		this.isVerified = isVerified;
		this.offLine = offLine;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Boolean getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}
	public Boolean getOffLine() {
		return offLine;
	}
	public void setOffLine(Boolean offLine) {
		this.offLine = offLine;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userAddress=" + userAddress
				+ ", isVerified=" + isVerified + ", offLine=" + offLine + "]";
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("classpath:com/akash/AOP/userBean.xml");
		UserService service = (UserService) context.getBean("userserv");
		service.addUser(new User("Akash","Ghaziabad",false,false));
	}
}