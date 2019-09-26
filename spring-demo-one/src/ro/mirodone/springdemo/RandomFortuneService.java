package ro.mirodone.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {


	String [] fortunes = {"Try harder !", "Not your lucky day !", "You are doing great!"};
	Random random = new Random();


	@Override
	public String getFortune() {

		// pick a random string from the array
		int index = random.nextInt(fortunes.length);

		String theFortune = fortunes[index];
		return theFortune;

	}

}
