package abstractClasses;

public abstract class Staff {

	private String name;
	private String salaryLevel;
	private int ID;
	
	public Staff(String name, String salaryLevel, int iD) {
		super();
		this.name = name;
		this.salaryLevel = salaryLevel;
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
