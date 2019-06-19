package com.revature.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	//define an init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println(">>TennisCoach: Inside of doMyStartupStuff()");
	}
	
	//define a destroy method
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println(">>TennisCoach: Inside of doMyCleanupStuff()");
	}
	
	//define a setter method
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: doSomeCrazyStuff");
//		fortuneService = theFortuneService;
//	}
	
	//Constructor injection
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
