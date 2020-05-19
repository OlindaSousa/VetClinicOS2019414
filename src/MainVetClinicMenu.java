import java.util.Scanner;

import abstractClasses.Staff;

public class MainVetClinicMenu {
	VetClinicHelper mvc;

	public MainVetClinicMenu() {

		mvc = new VetClinicHelper();
		mvc.staffList();
		mvc.animalsList();

		welcomeMenu();

	}

	public void welcomeMenu() {

		System.out.println("Welcome to OS VetClinic!");
		System.out.println("What information would like to consult:");
		System.out.println("1 - Staff");
		System.out.println("2 - Aninals");

		Scanner myScanner = new Scanner(System.in);
		String option = myScanner.next();

		if (option.equals("1")) {

			System.out.println("What would you like to see from our staff list:");
			System.out.println("1 - List of all staff members");
			System.out.println("2 - Staff listed by category");
			System.out.println("3 - Staff working at the moment");
			System.out.println("4 - Search for a specific staff by name");

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
					System.out.println("Name of Staff: " + s.getName() + " " + s.getSurname() + "\n"
							+ "Staff occupaton: " + s.getOccupation() + "\n" + "Tasks: " + s.getTasks() + "\n"
							+ "Salary level: " + "xx" + "\n");
				}

				else {
					System.out.println(staffName.toUpperCase() + " is not found");
				}
			}

			else {
				System.out.println("Invalid option. Please insert number 1, 2, 3 or 4.");
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
				mvc.searchAnimal(animalName);
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
		System.out.println("5 - TraineeVet");

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
			String category = "traineevet";
			mvc.searchByCategory(category);
		}

		else {
			System.out.println("Invalid option. Please insert number 1, 2, 3, 4 or 5.");
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
