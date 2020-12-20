package lesson201209.homework.employee.engineer.developers;

import lesson201209.homework.employee.engineer.Engineer;

public class FrontEndDeveloper extends Developer {

	
	public FrontEndDeveloper(String firstName, String lastName, int workingHours, String position,
			double amountOfExperience) {
		super(firstName, lastName, workingHours, position, amountOfExperience);
	}

	@Override
	public void mainJob() {
		System.out.println("Builds web application");
	}

	@Override
	public void doJob(String task) {
		System.out.println("Creating UI for the task: " + task);
	}
	
	@Override
	public void holdsWorkshop() {
		super.holdsWorkshop();
		System.out.println("Talks about prons and cons for specific front-end framework");
	}

}
