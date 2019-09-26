package ro.mirodone.springdemo;

public class HandballCoach implements Coach {

	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//add new fields
	
	private String emailAddress;
	private String teamName;
	
	

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("HandballCoach: inside constructor - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("HandballCoach: inside constructor - setTeamName");
		this.teamName = teamName;
	}


	// create constructor
	public HandballCoach() {
		System.out.println("HandballCoach: inside constructor");
	}

	// setter method for SETTER INJECTIOn
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("HandballCoach: inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {

		return "Penalty kick practice 5 rep";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
