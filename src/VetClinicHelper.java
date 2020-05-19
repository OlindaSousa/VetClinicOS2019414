
import abstractClasses.Animals;
import abstractClasses.Staff;
import animal.*;
import staff.*;

public class VetClinicHelper {

	static Staff[] staffList = new Staff[10];
	static Animals[] animalsList = new Animals[1000];

	public static void main(String[] args) {

	}

	static StaffGenerator myStaffGenerator = new StaffGenerator();
	static AnimalGenerator myAnimalGenerator = new AnimalGenerator();

	public Staff[] staffList() {

		// Helper

		// Recepcionist
		for (int i = 0; i < 2; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String tasks = myStaffGenerator.getRandomTasks();
			String[] nameParts = staffName.split(" ");
			Staff list = new Receptionist(nameParts[0], nameParts[1], tasks, "", i, "");
			staffList[i] = list;

		}

		// IT Nerd
		for (int i = 2; i < 4; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new ITNerd(nameParts[0], nameParts[1], "", "", i, "");

			staffList[i] = list;

		}

		// Nurse
		for (int i = 4; i < 6; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new Nurse(nameParts[0], nameParts[1], "", "", i, "");

			staffList[i] = list;

		}

		// Veterinarian
		for (int i = 6; i < 8; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new Veterinarian(nameParts[0], nameParts[1], "", "", i, "");

			staffList[i] = list;

		}

		// TraineeVet
		for (int i = 8; i < 10; i++) {

			String staffName = myStaffGenerator.getRandomName();
			
			String[] nameParts = staffName.split(" ");

			Staff list = new TraineeVet(nameParts[0], nameParts[1], "", "", i, "");

			staffList[i] = list;

		}

		return staffList;

	}

	public void tasks() {
		for (Staff s : staffList) {			
			System.out.println("Name of Staff: " + s.getName() + " " + s.getSurname() + " \n" + "Tasks: " + s.getTasks() + "\n");
		}

	}

	public void printStaff() {
		for (Staff s : staffList) {
			System.out.println("ID: "+ s.getID() + "\n"+ "Name of Staff: " + s.getName() + " " + s.getSurname() + "\n" + "Staff occupaton: "
					+ s.getClass().getSimpleName() + "\n" + "Tasks: " + s.getTasks() + "\n" + "Salary level: " + "xx"
					+ "\n");
		}
	}

	public void searchByCategory(String category) {

		for (Staff s : staffList) {

			if (s.getOccupation().equalsIgnoreCase(category)) {
				System.out.println(s.getName() + " " + s.getSurname());
			}

		}

	}

	public Staff searchStaff(String staffName) {

		for (Staff s : staffList) {
			if (s.getName().equalsIgnoreCase(staffName)) {
				return s;
			}
		}
		
		return null;
	}

	public Animals[] animalsList() {

		// Cat
		for (int i = 0; i < 400; i++) {

			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalGenerator.getRandomMedicalCondition();
			int age = myAnimalGenerator.getRandomAge();

			Animals animalList = new Cat(nameParts[0], age, medicalCondicion, "", 0);

			animalsList[i] = animalList;

		}

		// Dog
		for (int i = 400; i < 650; i++) {

			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalGenerator.getRandomMedicalCondition();
			int age = myAnimalGenerator.getRandomAge();

			Animals animalList = new Dog(nameParts[0], age, medicalCondicion, "", 0);

			animalsList[i] = animalList;

		}

		// Rabbit
		for (int i = 650; i < 1000; i++) {

			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalGenerator.getRandomMedicalCondition();
			int age = myAnimalGenerator.getRandomAge();

			Animals animalList = new Rabbit(nameParts[0], age, medicalCondicion, "", 0);

			animalsList[i] = animalList;

		}

		return animalsList;
	}

	public void printAnimals(Animals[] animalList) {

		for (Animals a : animalsList) {

			System.out.println("Name of animal: " + a.getName() + "\n" + "Type of Animal: " + a.getTypeOfAnimal() + "\n"
					+ "Age: " + a.getAge() + "\n" + "Medical Condition: " + a.getMedicalCondition() + "\n");
		}
	}

	public static void animalAge() {
		//TODO
	}

	public static void medicalCondition() {
		//TODO
	}

	public void searchByCategoryAnimal(String type) {

		for (Animals a : animalsList) {
			if (a.getTypeOfAnimal().equalsIgnoreCase(type)) {
				System.out.println(a.getName() + " " + a.getTypeOfAnimal());
			}

		}

	}

	public void searchAnimal(String animalName) {

		for (Animals a : animalsList) {
			if (a.getName().equalsIgnoreCase(animalName)) {
				System.out.println(a.getName() + " " + a.getTypeOfAnimal());
			}

		}

	}

}
