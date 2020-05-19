package animal;

import abstractClasses.Animals;

public class Cat extends Animals{

	public Cat(String name, int age, String medicalCondition, String typeOfAnimal, int iD) {
		super(name, age, medicalCondition, typeOfAnimal, iD);
		
		this.setTypeOfAnimal("Cat");
	}
	
	

}
