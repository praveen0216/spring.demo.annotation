package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read Spring config file
	ClassPathXmlApplicationContext context= new 	
			ClassPathXmlApplicationContext("applicationContext.xml");
		
	//get the beans from Spring Container
	Coach theCoach=context.getBean("tennisCoach",Coach.class);
	
		//call a method on the bean
	
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
		
	//close the context
 
	context.close();
	}

}
