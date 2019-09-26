package ro.mirodone.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach funnyCoach = context.getBean("mySoccerCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("----------------------------------------------------------------");
		
		//call methods on the bean - soccer
		System.out.println(funnyCoach.getDailyWorkout());
		
		System.out.println(funnyCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
