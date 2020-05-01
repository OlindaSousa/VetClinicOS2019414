package abstractClasses;

public abstract class Animals {

	private String name;
	private int age;
	private String medicalCondition;
	private int ID;

	public Animals(String name, int age, String medicalCondition, int iD) {
		super();
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
		ID = iD;
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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
