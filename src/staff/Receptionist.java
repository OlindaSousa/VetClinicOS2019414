package staff;

import abstractClasses.Staff;

public class Receptionist extends Staff {

	public Receptionist(String name, String surname,String tasks, double salaryLevel, int iD, String occupation) {
		super(name, surname,tasks, salaryLevel, iD, occupation);
		
		this.setSalaryLevel(1500.0);
		this.setOccupation("receptionist");
	}

	
}
