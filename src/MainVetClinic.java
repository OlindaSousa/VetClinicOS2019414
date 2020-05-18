
import abstractClasses.Animals;
import abstractClasses.Staff;
import animal.*;
import staff.*;

public class MainVetClinic {
	
	static Staff[] staffList = new Staff[10];
	static Animals[] animalsList = new Animals[6];
	
	public static void main(String[] args) {

		//staffList();
		//printStaff(staffList);
		//tasks();
//		animals();
//		animalAge();
//		medicalCondition();
	}

	static StaffGenerator myStaffGenerator = new StaffGenerator();
	static AnimalGenerator myAnimalGenerator = new AnimalGenerator();

	public void searchByCategory(String category) {
		
		for (Staff s : staffList) {
			if (s.getOccupation().equalsIgnoreCase(category)) {
				System.out.println(s.getName() + " " + s.getOccupation());
			}

		}

	}
	public void searchStaff(String staffName) {

		for (Staff s : staffList) {
			if (s.getName().equalsIgnoreCase(staffName)) {
				System.out.println(s.getName() + " " + s.getOccupation());
			}

		}

	}

	public void printStaff(Staff[] list) {

		for (Staff s : staffList) {

			System.out.println("Staff name: " + s.getName() + " " + s.getSurname());
		}
	}

	public Staff[] staffList() {

		// Helper

		// Recepcionist
		for (int i = 0; i < 2; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new Receptionist(nameParts[0], nameParts[1], "", "", 0, "");

			staffList[i] = list;

		}

		// IT Nerd
		for (int i = 2; i < 4; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new ITNerd(nameParts[0], nameParts[1], "", "", 0, "");

			staffList[i] = list;

		}

		// Nurse
		for (int i = 4; i < 6; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new Nurse(nameParts[0], nameParts[1], "", "", 0, "");

			staffList[i] = list;

		}

		// Veterinarian
		for (int i = 6; i < 8; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new Veterinarian(nameParts[0], nameParts[1], "", "", 0, "");

			staffList[i] = list;

		}

		// TraineeVet
		for (int i = 8; i < 10; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new TraineeVet(nameParts[0], nameParts[1], "", "", 0, "");

			staffList[i] = list;

		}

		return staffList;

	}

	public void tasks() {

		for (int i = 0; i < staffList.length; i++) {
			String tasks = myStaffGenerator.getRandomTasks();

			for (Staff s : staffList) {
				System.out.println(s.getName() + " " + s.getOccupation() + " " + tasks);

			}
		}

	}

	public static void animals() {

		// Cat
		for (int i = 0; i < 2; i++) {

			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");

			Animals animalList = new Cat(nameParts[0], 0, "", 0);

			animalsList[i] = animalList;

		}

		// Dog
		for (int i = 2; i < 4; i++) {

			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");

			Animals animalList = new Dog(nameParts[0], 0, "", 0);

			animalsList[i] = animalList;

		}

		// Rabbit
		for (int i = 4; i < 6; i++) {

			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");

			Animals animalList = new Rabbit(nameParts[0], 0, "", 0);

			animalsList[i] = animalList;

		}

		for (Animals a : animalsList) {

			System.out.println("Animal name: " + a.getName());
		}
	}

	public static void animalAge() {

		// int animalAge = myAnimalGenerator.getRandomAge();
		// int[] age = animalAge;

	}

	public static void medicalCondition() {
		for (int i = 1; i < 6; i++) {

			String medicalCondicion = myAnimalGenerator.getRandomMedicalCondition();
			// String[] mCond = medicalCondicion.split(" ");

			System.out.println("Animal medical condition: " + medicalCondicion);
		}

	}

}
