import java.util.Random;

public class AnimalGenerator {

	protected String[] nameAnimal = { "Buddy", "Dengo", "Beethoven", "Marley", "Lassie", "Lady", "Trump", "Snow",
			"Bolt", "Scooby-Doo", "Max", "Hachi-ko", "Bob", "Tilly", "Daisy", "Poppy", "Teddy", "Luna", "Bella",
			"Bobby", "Spark", "Benji", "Duke", "Duchess", "Fritz", "Garfild", "Jiggles", "Bubbles", "Meatball", "Jelly",
			"Angus", "Einstein", "Yoda", "Helix", "Apollo", "Nala" };
	protected int[] age = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
	protected String[] medicalCondition = { "Heart", "Cancer", "Diabetes", "Rabies", "Parvovirus", "Ringworm",
			"Allergies", "Arthritis", "Bronchitis", "Deafness", "Influenza Virus", "Diarrhea", "Depression",
			"Deafness ", "Dental Disease", "llergy", "Pancreatitis", "Pregnancy", "Worms", "Glaucoma", };

	public AnimalGenerator() {

	}

	public String getRandomAnimal() {
		// return a random name
		Random r = new Random();
		// pick a firstname and surname based on length of array
		String aname = nameAnimal[r.nextInt(nameAnimal.length)];
		//String mcondition = medicalCondition[r.nextInt(medicalCondition.length)];
		return (aname);
	}

	public String getRandomMedicalCondition() {
		// return a random medical condition
		Random r = new Random();
		String mcondition = medicalCondition[r.nextInt(medicalCondition.length)];
		return (mcondition);
	}

	public int getRandomAge() {
		Random r = new Random();
		int ageAnimal = age[r.nextInt(age.length)];
		return (ageAnimal);
	}
}
