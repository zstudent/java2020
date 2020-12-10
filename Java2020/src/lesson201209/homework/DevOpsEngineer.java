package lesson201209.homework;

public class DevOpsEngineer extends Employee{

	
	public DevOpsEngineer(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}
	
	@Override
	void mainJob() {
		System.out.println("Builds environment for system and deployes it");
	}

	@Override
	void doJob(String task) {
		System.out.println("Deploying completed functionality of the task: " + task);
	}

}
