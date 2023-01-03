package com.springDemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load spring config file

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retreive bean from spring container 

		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on bean

		System.out.println(theCoach.getDailyWorkout());

		// close the context

		context.close();		
	}

}
