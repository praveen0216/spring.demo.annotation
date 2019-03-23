package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for our sad fortune service
	 @Bean 
	 public FortuneService randomFortuneService()
	 {
		 return new RandomFortuneService();
	 }
	
	//define bean for our chess coach and inject dependency
	
	@Bean
	public Coach chessCoach() {
		return new ChessCoach(randomFortuneService());
	}
	
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(randomFortuneService());
	}

}
