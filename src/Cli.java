/**
 * 
 * @author Olinda Sousa https://github.com/OlindaSousa/VetClinicOS2019414
 * 
 *         Here it is instantiated the VetClinicMenu. The system it will be run
 *         from here.
 *
 */

public class Cli {

	public static void main(String[] args) {
		new Cli();

	}

	public Cli() {
		Menu();
	}

	public void Menu() {
		VetClinicMenu menu = new VetClinicMenu();
		menu.welcomeMenu();
	}

}
