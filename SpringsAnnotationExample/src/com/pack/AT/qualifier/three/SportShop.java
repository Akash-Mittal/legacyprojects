package com.pack.AT.qualifier.three;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.aspectj.AnnotationBeanConfigurerAspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportShop {
private List<Bat> bats;
private List<Ball> balls;

@Autowired
public SportShop(@Qualifier("bat1") List<Bat> bats,@Qualifier("ball1")  List<Ball> balls) {
	super();
	this.bats = bats;
	this.balls = balls;
}

public SportShop() {
	// TODO Auto-generated constructor stub
}


@PostConstruct
public void clearcache(){
	System.out.println("PostConstruct");
}

@PreDestroy
public void populate(){
	System.out.println("PreDestroy");
}

public List<Bat> getBats() {
	return bats;
}
public void setBats(List<Bat> bats) {
	this.bats = bats;
}
public List<Ball> getBalls() {
	return balls;
}

public void setBalls(List<Ball> balls) {
	this.balls = balls;
}

@Override
public String toString() {
	return "SportShop [bats=" + bats + ", balls=" + balls + "]";
}


public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/pack/AT/qualifier/three/ATE3Bean.xml");
	SportShop shop = (SportShop) context.getBean("shopBean");
	System.out.println(shop);
	context = new AnnotationConfigApplicationContext(SportShop.class);
}
}
