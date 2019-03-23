package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredAnnotationDemoApp {
	
	public static void main(String[] args) {
	//creating spring container
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//calling bean
	
	Coach theCoach= context.getBean("swimCoach", Coach.class);
	System.out.println("------->>>");
	System.out.println("Daily fortune : Testing   "+theCoach.getDailyFortune());
	
	context.close();
	
	
	}
	
	

}
