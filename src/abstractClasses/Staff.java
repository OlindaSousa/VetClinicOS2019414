package abstractClasses;

/**
 * 
 * @author Olinda Sousa
 * 
 *         The Staff Class contains the objects that will be instantiated for
 *         the subclass Receptionists, IT, Nurse, Veterinarian, Veterinarian
 *         Dentist, Veterinarian Neurologist, Veterinarian Surgeon, Trainee Vet.
 *         The methods implemented here will be overridden in the subclass.
 *
 */

public abstract class Staff {

	private String name;
	private String surname;
	private String tasks;
	private double salaryLevel;
	private int ID;
	private String occupation;

	public Staff(String name, String surname, String tasks, double salaryLevel, int iD, String occupation) {
		super();
		this.name = name;
		this.surname = surname;
		this.tasks = tasks;
		this.salaryLevel = salaryLevel;
		ID = iD;
		this.occupation = occupation;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTasks() {
		return tasks;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
	}

	public double getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(double salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
