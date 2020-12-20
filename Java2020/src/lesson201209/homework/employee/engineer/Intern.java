package lesson201209.homework.employee.engineer;

import lesson201209.homework.employee.Employee;

public class Intern extends Engineer {

	
	public Intern(String firstName, String lastName, int workingHours, String position, double amountOfExperience) {
		super(firstName, lastName, workingHours, position, amountOfExperience);
	}

	@Override
	public void mainJob() {
		System.out.println("Watchs trainings and does homeworks");
	}

	@Override
	public void doJob(String task) {
		System.out.println("Starting doing homework: " + task);
	}

	@Override
	public void createsDocumentation() {
		// TODO Auto-generated method stub
	}

	@Override
	public void holdsWorkshop() {
		System.out.println("Talks about how to be a good intern");
	}

}
