import java.util.Scanner;

import abstractClasses.*;

/**
 * 
 * @author Olinda Sousa
 * 
 *         This is the Main Menu where the system will be run. The Menu is
 *         divided in sections first is necessary to create all Staff an Animal
 *         list to be possible return the methods following.
 *         All methods have an option to return the previous Menu.
 *
 */

public class VetClinicMenu {
	// It is instantiating the class VetClinicHelper
	VetClinicHelper mvc;

	public VetClinicMenu() {
		// it is acessing the methods from VetClinicHelper
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

	/*
	 * The system will start giving the user 3 options to select Staff, Animal and
	 * Finish
	 */
	public void welcomeMenu() {

		System.out.println("Welcome to OS VetClinic! \n \n");
		System.out.println("What information would like to consult: \n");
		System.out.println("1 - Staff");
		System.out.println("2 - Aninals");
		System.out.println("0 - Finish");

		Scanner myScanner = new Scanner(System.in);
		String option = myScanner.next();

		/*
		 * 
		 */
		if (option.equals("1")) {
			mainMenu();

			String staffOption = myScanner.next();

			if (staffOption.equals("1")) {
				mvc.printStaff();
				System.out.println("*******END OF LIST*****\n");
				welcomeMenu();
			}

			else if (staffOption.equals("2")) {
				categoryOptions();
				System.out.println("\n*******END OF LIST*****\n");
				System.out.println("Do you like to return the Welcome Menu or the Staff List Menu?");
				System.out.println("1 - Main Menu");
				System.out.println("2 - Staff List Menu");

				String menuOption = myScanner.next();
				if (menuOption.equals("1")) {
					welcomeMenu();
				}

				else if (menuOption.equals("2")) {
					categoryOptions();
					System.out.println("\n*******END OF LIST*****\n");
					System.out.println("Do you like to return the Welcome Menu or the Staff List Menu?");
					System.out.println("1 - Main Menu");
					System.out.println("2 - Staff List Menu");
				}

			}

			else if (staffOption.equals("3")) {
				mvc.tasks();
				System.out.println("*******END OF LIST*****\n");
				welcomeMenu();
			}

			else if (staffOption.equals("4")) {
				searchByStaffName();
				System.out.println("\n*******END OF LIST*****\n");
				welcomeMenu();
			}

			else if (staffOption.equals("5")) {
				assignedMedicalStaff();
				System.out.println("\n*******END OF LIST*****\n");
				System.out.println("Do you like to return the Welcome Menu or the Medical Menu?");
				System.out.println("1 - Main Menu");
				System.out.println("2 - Medical Menu");

				String menuOption = myScanner.next();
				if (menuOption.equals("1")) {
					welcomeMenu();
				}

				else if (menuOption.equals("2")) {
					assignedMedicalStaff();
					System.out.println("\n*******END OF LIST*****\n");
					System.out.println("Do you like to return the Welcome Menu or the Medical Menu?");
					System.out.println("1 - Main Menu");
					System.out.println("2 - Medical Menu");
				}

			}

			else if (staffOption.equals("6")) {
				lookedByMedicalStaff();
				System.out.println("\n*******END OF LIST*****\n");
				System.out.println("Do you like to return the Welcome Menu or the Medical Menu?");
				System.out.println("1 - Main Menu");
				System.out.println("2 - Medical Menu");

				String menuOption = myScanner.next();
				if (menuOption.equals("1")) {
					welcomeMenu();
				}

				else if (menuOption.equals("2")) {
					lookedByMedicalStaff();
					System.out.println("\n*******END OF LIST*****\n");
					System.out.println("Do you like to return the Welcome Menu or the Medical Menu?");
					System.out.println("1 - Main Menu");
					System.out.println("2 - Medical Menu");
				}
			}

			else if (staffOption.equals("0")) {
				welcomeMenu();
			}
		}

		else if (option.equals("2")) {

			System.out.println("What would you like to see from animal list:");
			System.out.println("1 - List of all animals:");
			System.out.println("2 - Animal listed by category:");
			System.out.println("3 - Search for a specific staff by name:");

			String animalOption = myScanner.next();

			if (animalOption.equals("1")) {
				mvc.printAnimals();
				System.out.println("*******END OF LIST*****\n");
				welcomeMenu();
			}

			else if (animalOption.equals("2")) {
				typeAnimals();
				System.out.println("\n*******END OF LIST*****\n");
				System.out.println("do you like to return the Welcome Menu or the Staff List Menu");
				System.out.println("1 - Main Menu");
				System.out.println("2 - Animal List Menu");

				String menuOption = myScanner.next();
				if (menuOption.equals("1")) {
					welcomeMenu();
				}

				else if (menuOption.equals("2")) {
					typeAnimals();
					System.out.println("*******END OF LIST*****\n");
					System.out.println("do you like to return the Welcome Menu or the Staff List Menu");
					System.out.println("1 - Main Menu");
					System.out.println("2 - Animal List Menu");
				}

			}

			else if (animalOption.equals("3")) {
				searcByAnimalName();
				System.out.println("*******END OF LIST*****\n");
				welcomeMenu();
			}

			else {
				System.out.println("Invalid option. Please insert number 1, 2 or 3");
			}

		}

		else if (option.equals("0")) {
			System.out.println("Thank you for visit our Vet Clinic");

		}

		else {
			System.out.println("Please select a valid number. 1, 2 or 0");
			welcomeMenu();
		}

	}

	// the method to select what the user want to see when it is select 1 - Staff
	public void mainMenu() {
		System.out.println("What would you like to see from our staff list:");
		System.out.println("1 - List of all staff members");
		System.out.println("2 - Staff listed by category");
		System.out.println("3 - Staff working at the moment");
		System.out.println("4 - Search for a specific staff by name");
		System.out.println("5 - List all the animals assigned to a member of medical staff");
		System.out.println(
				"6 - List the order in which pets will be looked after by a particular member of the medical staff");
		System.out.println("0 - return to Menu");
	}

	/*
	 * the method to select what the user want to see when it is select 2 - Staff
	 * listed by category
	 */
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
		System.out.println("0 - return to Menu");

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

		else if (categoryOption.equals("0")) {
			welcomeMenu();
		}

		else {
			System.out.println("Invalid option. Please insert number 1, 2, 3, 4, 5, 6, 7 or 8.");
			categoryOptions();
		}

	}

	/*
	 * the method to select what the user want to see when it is select 4 - Search
	 * for a specific staff name. In this case on VetClinicHelper the name was
	 * stored and now it will check if it is different from null will return the
	 * staff name information
	 */
	public void searchByStaffName() {
		System.out.println("Please insert staff Name");
		Scanner myScanner = new Scanner(System.in);
		String staffName = myScanner.next();
		Staff s = mvc.searchStaff(staffName);

		if (s != null) {
			System.out.println("Staff ID: " + s.getID() + "\n" + "Staff Name: " + s.getName() + " " + s.getSurname()
					+ "\n" + "Staff Occupaton: " + s.getClass().getSimpleName() + "\n" + "Salary level: "
					+ s.getSalaryLevel() + "\n");
		}

		else {
			System.out.println(staffName.toUpperCase() + " is not found");
		}
	}

	/*
	 * the method to select what the user want to see when it is select 5 - List all
	 * the animals assigned to a member of medical staff
	 */
	public void assignedMedicalStaff() {

		System.out.println("Please select one of the options below:");
		System.out.println("1 - Dentist");
		System.out.println("2 - Surgeon");
		System.out.println("3 - Neurologist");
		System.out.println("4 - Nurse");
		System.out.println("5 - Trainee Vet");
		System.out.println("6 - Veterinarian");
		System.out.println("0 - return to Menu");

		Scanner myScanner = new Scanner(System.in);
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
		} else if (doctorSelected.equals("0")) {
			welcomeMenu();
		} else {
			System.out.println("Invalid option. Please insert number 1, 2, 3, 4, 5 or 6.");
			assignedMedicalStaff();
		}
	}

	/*
	 * the method to select what the user want to see when it is select 6 - List the
	 * order in which pets will be looked after by a particular member of the
	 * medical staff
	 */
	public void lookedByMedicalStaff() {
		System.out.println("Please select one of the options below:");
		System.out.println("1 - Dentist");
		System.out.println("2 - Surgeon");
		System.out.println("3 - Neurologist");
		System.out.println("4 - Nurse");
		System.out.println("5 - Trainee Vet");
		System.out.println("6 - Veterinarian");
		System.out.println("0 - return to Menu");

		Scanner myScanner = new Scanner(System.in);
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
		} else if (doctorSelected.equals("0")) {
			welcomeMenu();
		} else {
			System.out.println("Invalid option. Please insert number 1, 2, 3, 4, 5 or 6.");
		}
	}

	/*
	 * the method to select what the user want to see when it is select 2 - Animal
	 * listed by category:
	 */
	public void typeAnimals() {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Select one of the types below:");
		System.out.println("1 - Dog");
		System.out.println("2 - Cat");
		System.out.println("3 - Habbit");
		System.out.println("4 - Bird");
		System.out.println("0 - return to Menu");

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

		else if (categoryOption.equals("0")) {
			welcomeMenu();
		}

		else {
			System.out.println("Invalid option. Please insert number 1, 2, 3 or 4.");
			typeAnimals();
		}

	}

	/*
	 * the method to select what the user want to see when it is select 3 - Search
	 * for a specific animal name. In this case on VetClinicHelper the name was
	 * stored and now it will check if it is different from null will return the
	 * animal name information
	 */
	public void searcByAnimalName() {
		Scanner myScanner = new Scanner(System.in);
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

}
