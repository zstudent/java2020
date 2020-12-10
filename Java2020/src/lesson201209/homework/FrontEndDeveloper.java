package lesson201209.homework;

public class FrontEndDeveloper extends Employee{

	
	public FrontEndDeveloper(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}
	
	@Override
	void mainJob() {
		System.out.println("Builds web application");
	}

	@Override
	void doJob(String task) {
		System.out.println("Creating UI for the task: " + task);
	}

}
