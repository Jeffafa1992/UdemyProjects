package com.revature.springdemo;

public class BaseballCoach implements Coach{
	//define private field for dependency
	private FortuneService fortuneService;	
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes at batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune
		return fortuneService.getFortune();
	}

}
