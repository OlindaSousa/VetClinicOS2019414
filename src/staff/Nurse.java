package staff;

import abstractClasses.Staff;

public class Nurse  extends Staff{

	public Nurse(String name, String surname,String tasks, String salaryLevel, int iD, String occupation) {
		super(name, surname, tasks, salaryLevel, iD, occupation);
		// TODO Auto-generated constructor stub
		
		this.setOccupation("nurse");
	}

}
