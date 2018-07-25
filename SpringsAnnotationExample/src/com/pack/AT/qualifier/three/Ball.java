package com.pack.AT.qualifier.three;

public class Ball {
	private String ballType;
	private String ballComp;
	private double ballPrice;
	public String getBallType() {
		return ballType;
	}
	public Ball() {
		// TODO Auto-generated constructor stub
	}
	
	public Ball(String ballType, String ballComp, double ballPrice) {
		super();
		this.ballType = ballType;
		this.ballComp = ballComp;
		this.ballPrice = ballPrice;
	}
	public void setBallType(String ballType) {
		this.ballType = ballType;
	}
	public String getBallComp() {
		return ballComp;
	}
	public void setBallComp(String ballComp) {
		this.ballComp = ballComp;
	}
	public double getBallPrice() {
		return ballPrice;
	}
	public void setBallPrice(double ballPrice) {
		this.ballPrice = ballPrice;
	}
	@Override
	public String toString() {
		return "Ball [ballType=" + ballType + ", ballComp=" + ballComp
				+ ", ballPrice=" + ballPrice + "]";
	}

}
