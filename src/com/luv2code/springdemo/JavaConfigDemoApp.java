package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read Spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the beans from Spring Container
		ChessCoach theCoach = context.getBean("chessCoach", ChessCoach.class);

		SwimCoach nCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean

		/*
		 * System.out.println(theCoach.getDailyWorkout());
		 * System.out.println(theCoach.getDailyFortune());
		 * 
		 * System.out.println("Email   --->"+theCoach.getEmail());
		 * System.out.println("team  -->>>> "+theCoach.getTeam());
		 */

		System.out.println("" + nCoach.getDailyFortune());

		// close the context

		context.close();
	}

}
