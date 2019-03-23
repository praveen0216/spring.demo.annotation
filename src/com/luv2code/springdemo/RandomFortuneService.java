package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of string
	
	private String[] data= {"good luck","All the best","Best of luck"};
	
	private Random myRandom=new Random();
	@Override
	public String getFortune() {
				//pick a random string from the array
		int index= myRandom.nextInt(data.length);
		
		return data[index];
	}

}
