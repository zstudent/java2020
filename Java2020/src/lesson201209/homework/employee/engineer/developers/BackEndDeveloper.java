package lesson201209.homework.employee.engineer.developers;

import lesson201209.homework.employee.engineer.Engineer;

public class BackEndDeveloper extends Developer {
	

	public BackEndDeveloper(String firstName, String lastName, int workingHours, String position,
			double amountOfExperience) {
		super(firstName, lastName, workingHours, position, amountOfExperience);
	}

	@Override
	public void mainJob() {
		System.out.println("Builds microservices and provides them to outer world");
	}

	@Override
	public void doJob(String task) {
		System.out.println("Starting building microservices for following task: " + task);
	}
	
	@Override
	public void createsDocumentation() {
		System.out.println("Writes documentation about microservices how do they work "
				+ "and which data they need to get satisfied result");
	}
	
	@Override
	public void holdsWorkshop() {
		super.holdsWorkshop();
		System.out.println("Reviewing the best design patterns to make microservices "
				+ "more clean and stable");
	}

}
