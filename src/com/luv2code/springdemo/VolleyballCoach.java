/**
 * 
 */
package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author alex
 *
 */
@Component
public class VolleyballCoach implements Coach {

	//@Autowired
	//@Qualifier("randomFortuneService")
private FortuneService	fortuneService;
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "VolleyballCoach: run 5Km ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
