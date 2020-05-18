package staff;

import abstractClasses.Staff;

public class Receptionist extends Staff {

	public Receptionist(String name, String surname,String tasks, String salaryLevel, int iD, String occupation) {
		super(name, surname,tasks, salaryLevel, iD, occupation);
		// TODO Auto-generated constructor stub
		
		this.setOccupation("receptionist");
	}

	
}
