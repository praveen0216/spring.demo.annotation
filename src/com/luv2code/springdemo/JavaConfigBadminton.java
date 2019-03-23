package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//ComponentScan("ccom.luv2code.springdemo") //package to scan
public class JavaConfigBadminton {
	
	@Bean
	public Coach badmintonCoach() {// bean id for BadmintonCoach class ; not neccesary to have a default bean id
		BadmintonCoach myBadmintonCoach=new BadmintonCoach(randomFortuneService());//need to pass object reference of FortuneService class
		return myBadmintonCoach;
	}
	//inject bean dependencies
	@Bean
	public FortuneService randomFortuneService()// bean id for fortune class implementation
	{
		return new RandomFortuneService();
	}
	

}
