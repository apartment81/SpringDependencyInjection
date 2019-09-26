package ro.mirodone.springdemo;

public class TrackCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run 5 laps.";
	}

	@Override
	public String getDailyFortune() {
		
		return "Do it !" + fortuneService.getFortune() ;
	}

}
