package lesson201209.homework;

public class ProjectManager extends Employee{
	
	
	public ProjectManager(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}

	@Override
	void mainJob() {
		System.out.println("Leads the project, holds business communication with customers");
	}

	@Override
	void doJob(String task) {
		System.out.println("Starting thinking about the task: " + task);
	}

}
