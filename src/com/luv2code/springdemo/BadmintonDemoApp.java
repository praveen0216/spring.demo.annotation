package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BadmintonDemoApp {

	public static void main(String[] args) {
	
		//load the spring container
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(JavaConfigBadminton.class);
		
		//retrieve the bean
		
		Coach theCoach=context.getBean("badmintonCoach",Coach.class);
		
		//method to invoke
		
		System.out.println("BadmintonCoach : WorkOutPlan>> "+theCoach.getDailyWorkout());
		System.out.println("BadmintonCoach : Fortune call>> "+theCoach.getDailyFortune());
		
		//close the context 
		context.close();

	}

}
