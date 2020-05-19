package staff;

import abstractClasses.Staff;

public class VeterinarySurgeon extends Staff{

	public VeterinarySurgeon(String name, String surname, String tasks, double salaryLevel, int iD, String occupation) {
		super(name, surname, tasks, salaryLevel, iD, occupation);
		
		this.setSalaryLevel(4500.0);
		this.setOccupation("veterinarian surgeon");

	}

}
