package lesson201209.homework.employee.engineer.testers;

import lesson201209.homework.employee.engineer.Engineer;

public class AutomationTester extends Tester {
	
	public AutomationTester(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}

	
	@Override
	public void mainJob() {
		System.out.println("Writes automation tests to check quality of system automatically");
	}

	@Override
	public void doJob(String task) {
		System.out.println("Starting writting automation tests for: " + task);
	}
	
	@Override
	public void holdsWorkshop() {
		super.holdsWorkshop();
		System.out.println("Talks about most efficient tools which help Automation tester "
				+ "for implementing automation tests");
	}
	
}
