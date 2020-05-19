package staff;

import abstractClasses.Staff;

public class IT  extends Staff{

	public IT(String name, String surname, String tasks, double salaryLevel, int iD, String occupation) {
		super(name, surname, tasks, salaryLevel, iD, occupation);
		// TODO Auto-generated constructor stub
		
		this.setSalaryLevel(1500.0);
		this.setOccupation("IT");
	}

}
