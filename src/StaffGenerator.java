import java.util.Random;

/**
 * 
 * @author Olinda Sousa
 * 
 *         The methods implemented in this class will be generate the Staff
 *         Names, Surnames and Tasks randomly. The random code was based on
 *         College project gives by Ken Healy on class (28.April).
 *
 */

public class StaffGenerator {

	protected String[] name = { "Edel", "Tom", "Sally", "Pavel", "Priscilla", "Claudia", "Eric", "Tatiana", "Mabel",
			"Debora", "Brian", "Zoe", "Emma", "Adrianna", "Aoife", "Ciaran", "Kristen", "Shauna", "Nollaig", "Stephen",
			"Natalia" };
	protected String[] surname = { "Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst", "Santos", "McBride",
			"Kozak", "Kenny", "Fogarty", "Burke", "Bailey", "Loch", "Brown", "O'Dowd", "Corrigan", "Dunne", "McCamley",
			"Klemmer" };
	protected String[] tasks = { "Filing", "Making Phone Calls", "On Holidays", "Make an appointment", "Answer phone",
			"Staff support", "Generate invoices for payment", "Bank reconciliation", "Buy office supplies",
			"Generate payroll" };

	public StaffGenerator() {

	}

	public String getRandomName() {
		// return a random name
		Random r = new Random();
		// pick a firstname and surname based on length of array
		String fname = name[r.nextInt(name.length)];
		String sname = surname[r.nextInt(surname.length)];
		return (fname + " " + sname);
	}

	public String getRandomTasks() {
		// return a random tasks
		Random r = new Random();
		// pick a tasks based on length of array
		String task = tasks[r.nextInt(tasks.length)];
		return (task);
	}
	
	@Override
	public String toString() {
		
		return this.name + " " + this.surname;
	}
}
