package com.luv2code.springdemo;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	public BadmintonCoach()
	{
		System.out.println("Inside default constructor :badminton coach class ");
	}
	
	public BadmintonCoach(FortuneService fortuneService) {
		System.out.println("Inside parameterized constructor :badminton coach class");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "BadmintonCoach: push up 3 sets";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
