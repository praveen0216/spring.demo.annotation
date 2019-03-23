package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context =new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		
		Coach theCoach =context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach =context.getBean("tennisCoach",Coach.class);
		
		//check if they are the same
		boolean result=(theCoach==alphaCoach);
		System.out.println("theCoach and alphaCoach are pointing to same : "+result);
		System.out.println("address of theCoach "+theCoach);
		System.out.println("address of alphaCoach "+alphaCoach);
		
		System.out.println("----------------");
		System.out.println("checking qualifier functionality:  "+theCoach.getDailyFortune());
		
		// close the cntext
		context.close();
		
		

	}

}
