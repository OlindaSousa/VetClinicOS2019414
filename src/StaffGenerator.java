import java.util.Random;

public class StaffGenerator {

	protected String[] name = {"Edel", "Tom", "Sally", "Pavel", "Priscilla", "Claudia", "Eric", "Tatiana", "Mabel", "Debora", "Brian", "Zoe", "Emma", "Adrianna", "Aoife", "Ciaran", "Kristen", "Shauna", "Nollaig", "Stephen"};
	protected String[] surname = {"Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst", "Santos", "McBride", "Kozak", "Kenny", "Fogarty", "Burke", "Bailey", "Loch", "Brown", "O'Dowd", "Corrigan", "Dunne", "McCamley", "Klemmer"};
	//protected String[] tasks = {"Heart", "Cancer", "Diabetes", "Rabies", "Parvovirus", "Ringworm", "Allergies", "Arthritis", "Bronchitis", "Deafness", "Influenza Virus", "Diarrhea", "Depression", "Deafness ", "Dental Disease",  "llergy", "Pancreatitis", "Pregnancy", "Worms", "Glaucoma",};
	
	//Filing, Making Phone Calls, On Holidays
	
	public StaffGenerator() {
		
	}
	
	public String getRandomName() {
		//return a random name
		
		Random random = new Random();
		
		//pick a firstname and surname based on length of array
		String fname = name[random.nextInt(name.length)];
		String sname = surname[random.nextInt(surname.length)];
		
		
		return (fname + " " + sname);
		
	}
	
	public String getTasks() {
		//return a random name
		
		Random random = new Random();
	
		String tasks = tasks[random.nextInt(tasks.length)];

	return (tasks);
	}
}
