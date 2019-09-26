package ro.mirodone.springdemo;

public class SoccerCoach implements Coach {


	private FortuneService fortuneService;


	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout () {
		return "Dribble for 5 minutes!" ;
	}

	@Override
	public String getDailyFortune() {

		return  fortuneService.getFortune() ;
	}

}
