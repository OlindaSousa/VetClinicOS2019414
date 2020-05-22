package abstractClasses;

/**
 * 
 * @author Olinda Sousa
 * 
 *         The Animal Class contains the objects that will be instantiated for
 *         the subclass Dog, Cat, Rabbit and Bird. The methods implemented here
 *         will be overridden in the subclass.
 *
 */

public abstract class Animals {

	private String name;
	private int age;
	private String medicalCondition;
	private String typeOfAnimal;
	private int IDAnimal;

	
	public Animals(String name, int age, String medicalCondition, String typeOfAnimal, int iDAnimal) {
		super();
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
		this.typeOfAnimal = typeOfAnimal;
		IDAnimal = iDAnimal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	public int getIDAnimal() {
		return IDAnimal;
	}

	public void setIDAnimal(int iDAnimal) {
		IDAnimal = iDAnimal;
	}

}
