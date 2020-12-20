package lesson201209.homework.employee.engineer;

import lesson201209.homework.employee.Employee;

public abstract class Engineer extends Employee {

	public Engineer(String firstName, String lastName, int workingHours, String position, double amountOfExperience) {
		super(firstName, lastName, workingHours, position, amountOfExperience);
	}

	@Override
	public void mainJob() {
		System.out.println("Designs, builds and maintains engines machines or structures");
	}

	@Override
	public void doJob(String task) {
		System.out.println("Going to start working on: " + task);
	}
	
	public abstract void createsDocumentation();
	
	public abstract void holdsWorkshop();

}
