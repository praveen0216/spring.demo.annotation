package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChessJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read Spring config java class
	AnnotationConfigApplicationContext context= new 	
			AnnotationConfigApplicationContext(SportConfig.class);
		
	//get the beans from Spring Container
	ChessCoach theCoach=context.getBean("chessCoach",ChessCoach.class);
	
		//call a method on the bean
	
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
	
	//call our new methods
	
	System.out.println("email : "+theCoach.getEmail());
	System.out.println("team : "+theCoach.getTeam());
	//close the context
 
	context.close();
	}

}
