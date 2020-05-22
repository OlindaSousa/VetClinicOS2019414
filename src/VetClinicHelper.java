import java.util.ArrayList;

import abstractClasses.*;
import animal.*;
import staff.*;

/**
 * 
 * @author Olinda Sousa
 * 
 *         Here it was created the methods that should be print in
 *         VetClinicMenu.
 *
 */

public class VetClinicHelper {

	static Staff[] staffList = new Staff[40];
	static Animals[] animalsList = new Animals[1000]; 
	private ArrayList<Animals> dentist = new ArrayList<>();
	private ArrayList<Animals> traineeVet = new ArrayList<>();
	private ArrayList<Animals> nurse = new ArrayList<>();
	private ArrayList<Animals> neurologist = new ArrayList<>();
	private ArrayList<Animals> surgeon = new ArrayList<>();
	private ArrayList<Animals> veterinarian = new ArrayList<>();

	static StaffGenerator myStaffGenerator = new StaffGenerator();
	static AnimalGenerator myAnimalGenerator = new AnimalGenerator();

	/*
	 * This method it will generate the Staff List
	 */
	public Staff[] staffList() {

		// Recepcionist
		for (int i = 0; i < 5; i++) {
			String staffName = myStaffGenerator.getRandomName();
			String tasks = myStaffGenerator.getRandomTasks();
			String[] nameParts = staffName.split(" ");
			Staff list = new Receptionist(nameParts[0], nameParts[1], tasks, 0, i, "");
			staffList[i] = list;
		}

		// IT Nerd
		for (int i = 5; i < 10; i++) {
			String staffName = myStaffGenerator.getRandomName();
			String tasks = myStaffGenerator.getRandomTasks();
			String[] nameParts = staffName.split(" ");
			Staff list = new IT(nameParts[0], nameParts[1], tasks, 0, i, "");
			staffList[i] = list;
		}

		// Nurse
		for (int i = 10; i < 15; i++) {
			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");
			Staff list = new Nurse(nameParts[0], nameParts[1], "", 0, i, "");
			staffList[i] = list;
		}

		// Veterinarian
		for (int i = 15; i < 20; i++) {
			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");
			Staff list = new Veterinarian(nameParts[0], nameParts[1], "", 0, i, "");
			staffList[i] = list;
		}

		// Veterinarian Dentist
		for (int i = 20; i < 25; i++) {
			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");
			Staff list = new VeterinaryDentist(nameParts[0], nameParts[1], "", 0, i, "");
			staffList[i] = list;
		}

		// Veterinarian Neurologist
		for (int i = 25; i < 30; i++) {
			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");
			Staff list = new VeterinaryNeurologist(nameParts[0], nameParts[1], "", 0, i, "");
			staffList[i] = list;
		}

		// Veterinarian Surgeon
		for (int i = 30; i < 35; i++) {
			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");
			Staff list = new VeterinarySurgeon(nameParts[0], nameParts[1], "", 0, i, "");
			staffList[i] = list;
		}

		// TraineeVet
		for (int i = 35; i < 40; i++) {
			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");
			Staff list = new TraineeVet(nameParts[0], nameParts[1], "", 0, i, "");
			staffList[i] = list;
		}

		return staffList;
	}

	/*
	 * The Tasks will be assign only Admin Staff (IT and Nurse)
	 */
	public void tasks() {
		for (Staff s : staffList) {

			if (s.getOccupation().equals("receptionist") || s.getOccupation().equals("IT")) {
				System.out.println("Staff ID: " + s.getID() + "\n" + "Staff Name: " + s.getName() + " " + s.getSurname()
						+ " \n" + "Tasks: " + s.getTasks() + "\n" + "Staff Occupaton: " + s.getOccupation() + "\n");
			}
		}
	}

	/*
	 * This method will be list all Staff it was generated on SttaffList
	 */
	public void printStaff() {
		for (Staff s : staffList) {
			System.out.println("Staff ID: " + s.getID() + "\n" + "Staff Name: " + s.getName() + " " + s.getSurname()
					+ "\n" + "Staff Occupaton: " + s.getClass().getSimpleName() + "\n" + "Salary level: "
					+ s.getSalaryLevel() + "\n");
		}
	}

	/*
	 * This method will be list all Staff by category it was generated on SttaffList
	 */
	public void searchByCategory(String category) {
		for (Staff s : staffList) {
			if (s.getOccupation().equalsIgnoreCase(category)) {
				System.out.println("Staff Name: " + s.getName() + " " + s.getSurname());
			}
		}
	}

	/*
	 * This method will search an specific name an if found it, it will storage
	 * otherwise it will return null.
	 */
	public Staff searchStaff(String staffName) {
		for (Staff s : staffList) {
			if (s.getName().equalsIgnoreCase(staffName)) {
				return s;
			}
		}
		return null;
	}

	/*
	 * This method it will generate the Animal List
	 */
	public Animals[] animalsList() {

		// Cat
		for (int i = 0; i < 250; i++) {

			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalGenerator.getRandomMedicalCondition();
			int age = myAnimalGenerator.getRandomAge();
			Animals animalList = new Cat(nameParts[0], age, medicalCondicion, "", i);
			animalsList[i] = animalList;
		}

		// Dog
		for (int i = 250; i < 500; i++) {
			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalGenerator.getRandomMedicalCondition();
			int age = myAnimalGenerator.getRandomAge();
			Animals animalList = new Dog(nameParts[0], age, medicalCondicion, "", i);
			animalsList[i] = animalList;
		}

		// Rabbit
		for (int i = 500; i < 750; i++) {
			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalGenerator.getRandomMedicalCondition();
			int age = myAnimalGenerator.getRandomAge();
			Animals animalList = new Rabbit(nameParts[0], age, medicalCondicion, "", i);
			animalsList[i] = animalList;
		}

		// Bird
		for (int i = 750; i < 1000; i++) {
			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			String medicalCondicion = myAnimalGenerator.getRandomMedicalCondition();
			int age = myAnimalGenerator.getRandomAge();
			Animals animalList = new Bird(nameParts[0], age, medicalCondicion, "", i);
			animalsList[i] = animalList;
		}
		return animalsList;
	}

	/*
	 * This method will be list all Animal it was generated on AnimalsList
	 */
	public void printAnimals() {

		for (Animals a : animalsList) {
			System.out.println("Animal ID: " + a.getIDAnimal() + "\n" + "Animal Name: " + a.getName() + "\n"
					+ "Animal Type: " + a.getTypeOfAnimal() + "\n" + "Age: " + a.getAge() + "\n" + "Medical Condition: "
					+ a.getMedicalCondition() + "\n");
		}
	}

	/*
	 * This method will be list all Animals by type it was generated on AnimalsList
	 */
	public void searchByCategoryAnimal(String type) {

		for (Animals a : animalsList) {
			if (a.getTypeOfAnimal().equalsIgnoreCase(type)) {
				System.out.println("Animal ID: " + a.getIDAnimal() + " - Animal Name: " + a.getName());
			}
		}
	}

	/*
	 * This method will search an specific animal name an if found it, it will
	 * storage otherwise it will return null.
	 */
	public Animals searchAnimal(String animalName) {
		for (Animals a : animalsList) {
			if (a.getName().equalsIgnoreCase(animalName)) {
				return a;
			}
		}
		return null;
	}

	/*
	 * This method will be assigned an animal to a member of medical staff
	 */
	public void assignAnimal() {

		for (Animals animal : animalsList) {

			if (animal.getMedicalCondition().equalsIgnoreCase("heart")
					|| animal.getMedicalCondition().equalsIgnoreCase("cancer")
					|| animal.getMedicalCondition().equalsIgnoreCase("glaucoma")) {
				surgeon.add(animal);
			} else if (animal.getMedicalCondition().equalsIgnoreCase("dental disease")
					|| animal.getMedicalCondition().equalsIgnoreCase("Oral Neoplasms")
					|| animal.getMedicalCondition().equalsIgnoreCase("Periodontal Disease")
					|| animal.getMedicalCondition().equalsIgnoreCase("Tooth Fractures")) {
				dentist.add(animal);
			} else if (animal.getMedicalCondition().equalsIgnoreCase("Rabies")
					|| animal.getMedicalCondition().equalsIgnoreCase("Idiopathic Epilepsy")
					|| animal.getMedicalCondition().equalsIgnoreCase("Intervertebral Disc Disease")) {
				neurologist.add(animal);
			} else if (animal.getMedicalCondition().equalsIgnoreCase("Dressings")
					|| animal.getMedicalCondition().equalsIgnoreCase("Take Medication")
					|| animal.getMedicalCondition().equalsIgnoreCase("Diarrhea")) {
				nurse.add(animal);
			} else if (animal.getMedicalCondition().equalsIgnoreCase("Ringworm")
					|| animal.getMedicalCondition().equalsIgnoreCase("Worms")
					|| animal.getMedicalCondition().equalsIgnoreCase("Fever")
					|| animal.getMedicalCondition().equalsIgnoreCase("Influenza Virus")) {
				traineeVet.add(animal);
			} else {
				veterinarian.add(animal);
			}
		}
	}

	/*
	 * This method will be list all the animals assigned to a member of medical
	 * staff
	 */
	public void assignedList(String occupation) {

		if (occupation.equalsIgnoreCase("surgeon")) {
			for (Animals a : surgeon) {
				System.out.println("ID " + a.getIDAnimal() + " 		Name: " + a.getName()
						+ "			Medical Condition: " + a.getMedicalCondition());
			}
		} else if (occupation.equalsIgnoreCase("dentist")) {
			for (Animals a : dentist) {
				System.out.println("ID " + a.getIDAnimal() + " 		Name: " + a.getName()
						+ "			Medical Condition: " + a.getMedicalCondition());
			}

		} else if (occupation.equalsIgnoreCase("neurologist")) {
			for (Animals a : neurologist) {
				System.out.println("ID " + a.getIDAnimal() + " 		Name: " + a.getName()
						+ "			Medical Condition: " + a.getMedicalCondition());
			}
		} else if (occupation.equalsIgnoreCase("nurse")) {
			for (Animals a : neurologist) {
				System.out.println("ID " + a.getIDAnimal() + " 		Name: " + a.getName()
						+ "			Medical Condition: " + a.getMedicalCondition());
			}
		} else if (occupation.equalsIgnoreCase("trainee vet")) {
			for (Animals a : neurologist) {
				System.out.println("ID " + a.getIDAnimal() + " 		Name: " + a.getName()
						+ "			Medical Condition: " + a.getMedicalCondition());
			}
		} else {
			for (Animals a : veterinarian) {
				System.out.println("ID " + a.getIDAnimal() + " 		Name: " + a.getName()
						+ "			Medical Condition: " + a.getMedicalCondition());
			}
		}
	}

	/*
	 * This method will be list the order in which pets will be looked after by a
	 * particular member of the medical staff
	 * 
	 */
	public void orderList(String occupation) {

		int position = 1;

		if (occupation.equalsIgnoreCase("surgeon")) {
			for (Animals a : surgeon) {
				System.out.println("Position " + position + " 		Name: " + a.getName());
				position++;
			}
		} else if (occupation.equalsIgnoreCase("dentist")) {
			for (Animals a : dentist) {
				System.out.println("Position " + position + " 		Name: " + a.getName());
				position++;
			}
		} else if (occupation.equalsIgnoreCase("neurologist")) {
			for (Animals a : neurologist) {
				System.out.println("Position " + position + " 		Name: " + a.getName());
				position++;
			}
		} else if (occupation.equalsIgnoreCase("nurse")) {
			for (Animals a : nurse) {
				System.out.println("Position " + position + " 		Name: " + a.getName());
				position++;
			}
		} else if (occupation.equalsIgnoreCase("trainee vet")) {
			for (Animals a : traineeVet) {
				System.out.println("Position " + position + " 		Name: " + a.getName());
				position++;
			}
		} else {
			for (Animals a : veterinarian) {
				System.out.println("Position " + position + " 		Name: " + a.getName());
				position++;
			}
			System.out.println(position);
		}
	}
}