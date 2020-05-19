package animal;

import abstractClasses.Animals;

public class Bird extends Animals{

	public Bird(String name, int age, String medicalCondition, String typeOfAnimal, int iD) {
		super(name, age, medicalCondition, typeOfAnimal, iD);
		
		this.setTypeOfAnimal("Bird");
	}

	
}
