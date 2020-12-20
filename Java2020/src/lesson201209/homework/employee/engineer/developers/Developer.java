package lesson201209.homework.employee.engineer.developers;

import lesson201209.homework.employee.engineer.Engineer;

public abstract class Developer extends Engineer {

	
	public Developer(String firstName, String lastName, int workingHours, String position, double amountOfExperience) {
		super(firstName, lastName, workingHours, position, amountOfExperience);
	}

	@Override
	public void holdsWorkshop() {
		System.out.println("Speaking and providing examples about the field");
	}
	
	@Override
	public void createsDocumentation() {
		System.out.println("Writes documentation for software");
	}
	
}
