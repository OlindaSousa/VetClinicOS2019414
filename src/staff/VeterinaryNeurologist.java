package staff;

import abstractClasses.Staff;

public class VeterinaryNeurologist extends Staff {

	public VeterinaryNeurologist(String name, String surname, String tasks, double salaryLevel, int iD,
			String occupation) {
		super(name, surname, tasks, salaryLevel, iD, occupation);

		this.setSalaryLevel(4000.0);
		this.setOccupation("veterinarian neurologist");

	}

}
