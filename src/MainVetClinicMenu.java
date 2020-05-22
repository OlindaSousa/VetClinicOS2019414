import java.util.Scanner;

import abstractClasses.Animals;
import abstractClasses.Staff;

/**
 * 
 * @author Olinda Sousa
 * 
 *         This is the Main Menu where the system will be run. The Menu is
 *         divided in sections first is necessary to create all Staff an Animal
 *         list to be possible return the methods following. 
 *
 */

public class MainVetClinicMenu {
	VetClinicHelper mvc;

	public MainVetClinicMenu() {

		mvc = new VetClinicHelper();

		/*
		 * when started the program needs to run the methods to create the Staff List,
		 * the Animal List and the Assign List by Animal.
		 */
		mvc.staffList();
		mvc.animalsList();
		mvc.assignAnimal();

		welcomeMenu();

	}

	public void welcomeMenu() {

		/*
		 * The system will start giving the user 2 options to select
		 */
		System.out.println("Welcome to OS VetClinic!");
		System.out.println("What information would like to consult:");
		System.out.println("1 - Staff");
		System.out.println("2 - Aninals");

		Scanner myScanner = new Scanner(System.in);
		String option = myScanner.next();

		/*
		 * 
		 */		
		if (option.equals("1")) {

			System.out.println("What would you like to see from our staff list:");
			System.out.println("1 - List of all staff members");
			System.out.println("2 - Staff listed by category");
			System.out.println("3 - Staff working at the moment");
			System.out.println("4 - Search for a specific staff by name");
			System.out.println("5 - List all the animals assigned to a member of medical staff");
			System.out.println(
					"6 - List the order in which pets will be looked after by a particular member of the medical\r\n"
							+ "staff");

			String staffOption = myScanner.next();

			if (staffOption.equals("1")) {
				mvc.printStaff();
			}

			else if (staffOption.equals("2")) {
				categoryOptions();
			}

			else if (staffOption.equals("3")) {
				mvc.tasks();
			}

			else if (staffOption.equals("4")) {

				System.out.println("Please insert staff Name");
				String staffName = myScanner.next();
				Staff s = mvc.searchStaff(staffName);

				if (s != null) {
					System.out.println("Staff ID: " + s.getID() + "\n" + "Staff Name: " + s.getName() + " "
							+ s.getSurname() + "\n" + "Staff Occupaton: " + s.getClass().getSimpleName() + "\n"
							+ "Salary level: " + s.getSalaryLevel() + "\n");
				}

				else {
					System.out.println(staffName.toUpperCase() + " is not found");
				}
			} else if (staffOption.equals("5")) {

				System.out.println("Please select one of the options below:");
				System.out.println("1 - Dentist");
				System.out.println("2 - Surgeon");
				System.out.println("3 - Neurologist");
				System.out.println("4 - Nurse");
				System.out.println("5 - Trainee Vet");
				System.out.println("6 - Veterinarian");

				String doctorSelected = myScanner.next();

				if (doctorSelected.equals("1")) {
					mvc.assignedList("dentist");
				} else if (doctorSelected.equals("2")) {
					mvc.assignedList("Surgeon");
				} else if (doctorSelected.equals("3")) {
					mvc.assignedList("Neurologist");
				} else if (doctorSelected.equals("4")) {
					mvc.assignedList("Nurse");
				} else if (doctorSelected.equals("5")) {
					mvc.assignedList("Trainee Vet");
				} else if (doctorSelected.equals("6")) {
					mvc.assignedList("Veterinarian");
				} else {

				}
			} else if (staffOption.equals("6")) {

				System.out.println("Please select one of the options below:");
				System.out.println("1 - Dentist");
				System.out.println("2 - Surgeon");
				System.out.println("3 - Neurologist");
				System.out.println("4 - Nurse");
				System.out.println("5 - Trainee Vet");
				System.out.println("6 - Veterinarian");

				String doctorSelected = myScanner.next();

				if (doctorSelected.equals("1")) {
					mvc.orderList("dentist");
				} else if (doctorSelected.equals("2")) {
					mvc.orderList("Surgeon");
				} else if (doctorSelected.equals("3")) {
					mvc.orderList("Neurologist");
				} else if (doctorSelected.equals("4")) {
					mvc.orderList("Nurse");
				} else if (doctorSelected.equals("5")) {
					mvc.orderList("Trainee Vet");
				} else if (doctorSelected.equals("6")) {
					mvc.orderList("Veterinarian");
				} else {

				}
			}

			else {
				System.out.println("Invalid option. Please insert number 1, 2, 3, 4, 5 or 6.");
			}
		}

		else if (option.equals("2")) {

			System.out.println("What would you like to see from animal list:");
			System.out.println("1 - List of all animals:");
			System.out.println("2 - Animal listed by category:");
			System.out.println("3 - Search for a specific staff by name:");

			String animalOption = myScanner.next();

			if (animalOption.equals("1")) {
				mvc.printAnimals(mvc.animalsList());
			}

			else if (animalOption.equals("2")) {

				typeAnimals();
			}

			else if (animalOption.equals("3")) {

				System.out.println("Please insert animal Name");
				String animalName = myScanner.next();
				Animals a = mvc.searchAnimal(animalName);
				
				if (a != null) {
					System.out.println("Animal ID: " + a.getIDAnimal() + "\n" + "Animal Name: " + a.getName() + "\n"
							+ "Animal Type: " + a.getTypeOfAnimal() + "\n" + "Age: " + a.getAge() + "\n" + "Medical Condition: "
							+ a.getMedicalCondition() + "\n");
				}
				
				else {
					System.out.println(animalName.toUpperCase() + " is not found");
				}
			}

			else {
				System.out.println("Invalid option. Please insert number 1, 2 or 3");
			}

		}

		else {
			System.out.println("Please select a valid number. 1 or 2");
			welcomeMenu();
		}
	}

	public void categoryOptions() {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Select one of the categories below:");
		System.out.println("1 - Receptionist");
		System.out.println("2 - IT");
		System.out.println("3 - Nurses");
		System.out.println("4 - Veterinarian");
		System.out.println("5 - Veterinarian Dentist");
		System.out.println("6 - Veterinarian Neurologist");
		System.out.println("7 - Veterinarian Surgeon");
		System.out.println("8 - TraineeVet");

		String categoryOption = myScanner.next();

		if (categoryOption.equals("1")) {
			String category = "receptionist";
			mvc.searchByCategory(category);
		}

		else if (categoryOption.equals("2")) {
			String category = "it";
			mvc.searchByCategory(category);
		}

		else if (categoryOption.equals("3")) {
			String category = "nurse";
			mvc.searchByCategory(category);
		}

		else if (categoryOption.equals("4")) {
			String category = "veterinarian";
			mvc.searchByCategory(category);
		}

		else if (categoryOption.equals("5")) {
			String category = "veterinarian dentist";
			mvc.searchByCategory(category);
		}

		else if (categoryOption.equals("6")) {
			String category = "veterinarian neurologist";
			mvc.searchByCategory(category);
		}

		else if (categoryOption.equals("7")) {
			String category = "veterinarian surgeon";
			mvc.searchByCategory(category);
		}

		else if (categoryOption.equals("8")) {
			String category = "trainee Vet";
			mvc.searchByCategory(category);
		}

		else {
			System.out.println("Invalid option. Please insert number 1, 2, 3, 4, 5, 6, 7 or 8.");
			categoryOptions();
		}

	}

	public void typeAnimals() {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Select one of the types below:");
		System.out.println("1 - Dog");
		System.out.println("2 - Cat");
		System.out.println("3 - Habbit");
		System.out.println("4 - Bird");

		String categoryOption = myScanner.next();

		if (categoryOption.equals("1")) {
			String type = "Dog";
			mvc.searchByCategoryAnimal(type);
		}

		else if (categoryOption.equals("2")) {
			String type = "Cat";
			mvc.searchByCategoryAnimal(type);
		}

		else if (categoryOption.equals("3")) {
			String type = "Rabbit";
			mvc.searchByCategoryAnimal(type);
		}

		else if (categoryOption.equals("4")) {
			String type = "Bird";
			mvc.searchByCategoryAnimal(type);
		}

		else {
			System.out.println("Invalid option. Please insert number 1, 2, 3 or 4.");
			typeAnimals();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MainVetClinicMenu();

	}

}
