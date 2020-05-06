import java.util.Random;

public class AnimalGenerator {

	protected String[] nameAnimal = {"Buddy", "Dengo", "Beethoven", "Marley", "Lassie", "Lady", "Trump", "Snow", "Bolt", "Scooby-Doo", "Max", "Hachi-ko","Bob", "Tilly", "Daisy", "Poppy", "Teddy", "Luna", "Bella", "Bobby", "Spark", "Benji", "Duke", "Duchess", "Fritz", "Garfild", "Jiggles", "Bubbles", "Meatball", "Jelly", "Angus", "Einstein", "Yoda", "Helix", "Apollo", "Nala"};
//	protected int[] age = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};

	
	public AnimalGenerator() {
		
	}
	
	public String getRandomAnimal() {
		//return a random name
		
		Random random = new Random();
		
		//pick a firstname and surname based on length of array
		String aname = nameAnimal[random.nextInt(nameAnimal.length)];
	//	int ageAnimal = age[random.nextInt()];
		
		return (aname);

	}

}
