package com.revature.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve from the spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//calling new methods for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
