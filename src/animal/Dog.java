package animal;

import abstractClasses.Animals;

public class Dog extends Animals{

	public Dog(String name, int age, String medicalCondition, String typeOfAnimal,int iD) {
		super(name, age, medicalCondition, typeOfAnimal,iD);
	
		this.setTypeOfAnimal("dog");
	}

	
}
