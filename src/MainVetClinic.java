
import abstractClasses.Animals;
import abstractClasses.Staff;
import animal.*;
import staff.*;

public class MainVetClinic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Helper
		Staff[] staffList = new Staff[10];
		StaffGenerator myStaffGenerator = new StaffGenerator();

		for (int i = 0; i < 2; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new Receptionist(nameParts[0], nameParts[1], "", 0);

			staffList[i] = list;

		}

		for (int i = 2; i < 4; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new ITNerd(nameParts[0], nameParts[1], "", 0);

			staffList[i] = list;

		}

		for (int i = 4; i < 6; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new Nurse(nameParts[0], nameParts[1], "", 0);

			staffList[i] = list;

		}

		for (int i = 6; i < 8; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new Veterinarian(nameParts[0], nameParts[1], "", 0);

			staffList[i] = list;

		}

		for (int i = 8; i < 10; i++) {

			String staffName = myStaffGenerator.getRandomName();
			String[] nameParts = staffName.split(" ");

			Staff list = new TraineeVet(nameParts[0], nameParts[1], "", 0);

			staffList[i] = list;

		}

		for (Staff s : staffList) {

			System.out.println("Staff name: " + s.getName() + " " + s.getSurname());
		}

		Animals[] animalsList = new Animals[6];
		AnimalGenerator myAnimalGenerator = new AnimalGenerator();

		for (int i = 0; i < 2; i++) {

			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");
			
			Animals animalList = new Cat(nameParts[0], 0, "", 0);

			animalsList[i] = animalList;

		}

		for (int i = 2; i < 4; i++) {

			String animalName = myAnimalGenerator.getRandomAnimal();
			String[] nameParts = animalName.split(" ");

			Animals animalList = new Dog(nameParts[0], 0, "", 0);

			animalsList[i] = animalList;

		}

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

}
