package staff;

import abstractClasses.Staff;

public class VeterinaryDentist extends Staff{

	public VeterinaryDentist(String name, String surname, String tasks, double salaryLevel, int iD, String occupation) {
		super(name, surname, tasks, salaryLevel, iD, occupation);
		
		this.setSalaryLevel(3800.0);
		this.setOccupation("veterinarian dentist");

	}

}
