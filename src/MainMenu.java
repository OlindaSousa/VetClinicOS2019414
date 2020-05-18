import java.util.Scanner;

public class MainMenu {
	MainVetClinic mvc;

	public MainMenu() {

		mvc = new MainVetClinic();
		mvc.staffList();

		welcomeMenu();

	}

	public void welcomeMenu() {

		System.out.println("Welcome to VetClinic Olinda!");

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
				mvc.printStaff(mvc.staffList());
			}

			else if (staffOption.equals("2")) {

				categoryOptions();

			} else if (staffOption.equals("3")) {
				mvc.tasks();
			} else if (staffOption.equals("4")) {

				System.out.println("Please insert staff Name");
				String staffName = myScanner.next();
				mvc.searchStaff(staffName);

			} else {
				System.out.println("Invalid option. Please insert number 1, 2, 3 or 4.");
			}
		}

		else if (option.equals("2")) {

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
		System.out.println("2 - Nurses");
		System.out.println("3 - Veterinarian");

		String categoryOption = myScanner.next();

		if (categoryOption.equals("1")) {
			String category = "receptionist";
			mvc.searchByCategory(category);

		}

		else if (categoryOption.equals("2")) {
			String category = "nurse";
			mvc.searchByCategory(category);

		}

		else if (categoryOption.equals("3")) {
			String category = "veterinarian";
			mvc.searchByCategory(category);

		} else {
			System.out.println("Invalid option. Please insert number 1, 2 or 3.");
			categoryOptions();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MainMenu();

	}
}
