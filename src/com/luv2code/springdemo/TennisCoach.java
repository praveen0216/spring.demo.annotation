package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	
	
	//define default constructor
	public TennisCoach()
	{
		System.out.println("TennisCoach: Inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println(">> Tennis Coach: Inside init");
	}
	//dfine my destroy method
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println(">> Tennis Coach: Inside Destroy");
	}
	
	
	/*@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService)
	{
		System.out.println("TennisCoach : Inside Parameterized Constructor");
		//System.out.println("TennisCoach : Inside Parameterized Constructor Email:"+email+"team : "+team);
		fortuneService=theFortuneService;
	}*/
	
	//setter methods
	/*@Autowired
	//@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println("TennisCoach: Inside setter methods");
		fortuneService=theFortuneService;
	}*/
	
	//any method
	/*@Autowired
	public void anyMethod(FortuneService theFortuneService)
	{
		System.out.println("TennisCoach: Inside any methods");
		fortuneService=theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
	
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	

}
