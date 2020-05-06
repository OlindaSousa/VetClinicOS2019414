import java.util.ArrayList;
import java.util.List;

import staff.*;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// iniciar o programa gerar o nome dos 10 staff 30 mrd e 1000 animais

		// criar o animal, pega o nome e salva
		// cria o staff, gera o nome e salva

		
		StaffGenerator myStaffGenerator = new StaffGenerator();
	
		List<Nurse> nurseNames = new ArrayList<Nurse>();
		
		for (int i = 0; i < 5; i++) {
		String staffList = myStaffGenerator.getRandomName();
		String Nome = staffList.substring(0,staffList.indexOf(" ") ) ;
		String Sobrenome = staffList.replace(Nome, "");
		Nurse N = new Nurse(Nome,Sobrenome,"",0);
		
		nurseNames.add(N);
		
		}
		
		for (Nurse s: nurseNames)
		{
			
			System.out.println(s.getName() + " " + s.getSurname());
		}

		List<Receptionist> receptNames = new ArrayList<Receptionist>();
		
		for (int i = 0; i < 5; i++) {
		String staffList = myStaffGenerator.getRandomName();
		String Nome = staffList.substring(0,staffList.indexOf(" ") ) ;
		String Sobrenome = staffList.replace(Nome, "");
		Receptionist N = new Receptionist(Nome,Sobrenome,"",0);
		
		receptNames.add(N);
		
		//System.out.println(Nome + Sobrenome);
		}
			
		for (Receptionist s: receptNames)
		{
			
			System.out.println(s.getName() + " " + s.getSurname());
		}

	}	

}
