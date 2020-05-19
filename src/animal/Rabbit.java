package animal;

import abstractClasses.Animals;

public class Rabbit extends Animals{

	public Rabbit(String name, int age, String medicalCondition, String typeOfAnimal, int iD) {
		super(name, age, medicalCondition, typeOfAnimal, iD);
		
		this.setTypeOfAnimal("Rabbit");
	}

}
