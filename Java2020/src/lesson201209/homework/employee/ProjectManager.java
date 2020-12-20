package lesson201209.homework.employee;

public class ProjectManager extends Employee{
	
	
	public ProjectManager(String firstName, String lastName, int workingHours, String position,
			double amountOfExperience) {
		super(firstName, lastName, workingHours, position, amountOfExperience);
	}

	@Override
	public void mainJob() {
		System.out.println("Leads the project, holds business communication with customers");
	}

	@Override
	public void doJob(String task) {
		System.out.println("Starting thinking about the task: " + task);
	}

}
