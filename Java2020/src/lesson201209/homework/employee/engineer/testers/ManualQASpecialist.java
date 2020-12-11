package lesson201209.homework.employee.engineer.testers;

import lesson201209.homework.employee.engineer.Engineer;

public class ManualQASpecialist extends Tester {
	
	public ManualQASpecialist(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}

	@Override
	public void mainJob() {
		System.out.println("Checks quality of system by manually testing system");
	}

	@Override
	public void doJob(String task) {
		System.out.println("Starting checking of: " + task);
	}
	
	@Override
	public void holdsWorkshop() {
		super.holdsWorkshop();
		System.out.println("Reviewing best techniques for manual testing");
	}

}
