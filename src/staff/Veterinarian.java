package staff;

import abstractClasses.Staff;

public class Veterinarian extends Staff{

	public Veterinarian(String name, String surname, String tasks, double salaryLevel, int iD, String occupation) {
		super(name, surname, tasks, salaryLevel, iD, occupation);
		// TODO Auto-generated constructor stub
		
		this.setSalaryLevel(3300.0);
		this.setOccupation("veterinarian");
	}

}
