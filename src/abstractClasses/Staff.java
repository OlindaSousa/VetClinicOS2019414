package abstractClasses;

public abstract class Staff {

	private String name;
	private String surname;
	//private String tasks;
	//public String categories / typeOfStaff;
	private String salaryLevel; // junior - enter level, pleno e senior
	private int ID;
	
	public Staff(String name, String surname, String salaryLevel, int iD) {
		super();
		this.name = name;
		this.surname = surname;
		this.salaryLevel = salaryLevel;
		ID = iD;
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
	public String getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(String salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
}
