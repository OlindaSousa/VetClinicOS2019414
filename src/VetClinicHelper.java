import java.util.ArrayList;

import abstractClasses.Animals;
import abstractClasses.Staff;
import animal.*;
import staff.*;

public class VetClinicHelper {
	
	

	static Staff[] staffList = new Staff[40];
	static Animals[] animalsList = new Animals[1000];
	private ArrayList<Animals> dentist = new ArrayList<>();
	private ArrayList<Animals> traineeVet = new ArrayList<>();
	private ArrayList<Animals> nurse = new ArrayList<>();
	private ArrayList<Animals> neurologist = new ArrayList<>();
	private ArrayList<Animals> surgeon = new ArrayList<>();
	private ArrayList<Animals> veterinarian = new ArrayList<>();

	public static void main(String[] args) {

		orderList();
	}
	

	private static void orderList() {
		// TODO Auto-generated method stub
		
	}


	static StaffGenerator myStaffGenerator = new StaffGenerator();
	static AnimalGenerator myAnimalGenerator = new AnimalGenerator();

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

	public void tasks() {
		for (Staff s : staffList) {

			if (s.getOccupation().equals("receptionist") || s.getOccupation().equals("IT")) {
				System.out.println("Staff ID: " + s.getID() + "\n" + "Staff Name: " + s.getName() + " " + s.getSurname()
						+ " \n" + "Tasks: " + s.getTasks() + "\n" + "Staff Occupaton: " + s.getOccupation() + "\n");
			}
		}
	}

	public void printStaff() {
		for (Staff s : staffList) {
			System.out.println("Staff ID: " + s.getID() + "\n" + "Staff Name: " + s.getName() + " " + s.getSurname()
					+ "\n" + "Staff Occupaton: " + s.getClass().getSimpleName() + "\n" + "Salary level: "
					+ s.getSalaryLevel() + "\n");
		}
	}

	public void searchByCategory(String category) {
		for (Staff s : staffList) {
			if (s.getOccupation().equalsIgnoreCase(category)) {
				System.out.println("Staff Name: " + s.getName() + " " + s.getSurname());
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

	public void printAnimals(Animals[] animalList) {

		for (Animals a : animalsList) {
			System.out.println("Animal ID: " + a.getIDAnimal() + "\n" + "Animal Name: " + a.getName() + "\n"
					+ "Animal Type: " + a.getTypeOfAnimal() + "\n" + "Age: " + a.getAge() + "\n" + "Medical Condition: "
					+ a.getMedicalCondition() + "\n");
		}
	}

	public void searchByCategoryAnimal(String type) {

		for (Animals a : animalsList) {
			if (a.getTypeOfAnimal().equalsIgnoreCase(type)) {
				System.out.println("Animal ID: " + a.getIDAnimal() + " - Animal Name: " + a.getName());
			}
		}
	}

	public void searchAnimal(String animalName) {

		for (Animals a : animalsList) {
			if (a.getName().equalsIgnoreCase(animalName)) {
				System.out.println("ID: " + a.getIDAnimal() + " - Name: " + a.getName());
			}
		}
	}

	public void orderList(String occupation) {

		int position = 1;

		if (occupation.equalsIgnoreCase("surgeon")) {
			for (Animals animal : surgeon) {
				System.out.println("Position " + position + " " + animal.getName());
				position++;
			}
		} else if (occupation.equalsIgnoreCase("dentist")) {
			for (Animals animal : dentist) {
				System.out.println("Position " + position + " " + animal.getName());
				position++;
			}
		} else if (occupation.equalsIgnoreCase("neurologist")) {
			for (Animals animal : neurologist) {
				System.out.println("Position " + position + " " + animal.getName());
				position++;
			}
		} else if (occupation.equalsIgnoreCase("nurse")) {
			for (Animals animal : nurse) {
				System.out.println("Position " + position + " " + animal.getName());
				position++;
			}
		} else if (occupation.equalsIgnoreCase("trainee vet")) {
			for (Animals animal : traineeVet) {
				System.out.println("Position " + position + " " + animal.getName());
				position++;
			}
		} else {
			for (Animals animal : veterinarian) {
				System.out.println("Position " + position + " " + animal.getName());
				position++;
			}
			
			System.out.println(position);
		}

	}

	public void assignedList(String occupation) {

		if (occupation.equalsIgnoreCase("surgeon")) {
			for (Animals animal : surgeon) {
				System.out.println("ID " + animal.getIDAnimal() + " " + animal.getName());
			}
		} else if (occupation.equalsIgnoreCase("dentist")) {
			for (Animals animal : dentist) {
				System.out.println(animal.getIDAnimal() + " " + animal.getName());
			}

		} else if (occupation.equalsIgnoreCase("neurologist")) {
			for (Animals animal : neurologist) {
				System.out.println("ID " + animal.getIDAnimal() + " " + animal.getName());
			}
		} else if (occupation.equalsIgnoreCase("nurse")) {
			for (Animals animal : neurologist) {
				System.out.println("ID " + animal.getIDAnimal() + " " + animal.getName());
			}
		} else if (occupation.equalsIgnoreCase("trainee vet")) {
			for (Animals animal : neurologist) {
				System.out.println("ID " + animal.getIDAnimal() + " " + animal.getName());
			}
		}else {
			for (Animals animal : veterinarian) {
				System.out.println("ID " + animal.getIDAnimal() + " " + animal.getName());
			}
		}
	}

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

}
