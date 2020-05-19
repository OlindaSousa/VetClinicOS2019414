package staff;

import abstractClasses.Staff;

public class Nurse  extends Staff{

	public Nurse(String name, String surname,String tasks, double salaryLevel, int iD, String occupation) {
		super(name, surname, tasks, salaryLevel, iD, occupation);
		// TODO Auto-generated constructor stub
		
		this.setSalaryLevel(2200.0);
		this.setOccupation("nurse");
	}

}
