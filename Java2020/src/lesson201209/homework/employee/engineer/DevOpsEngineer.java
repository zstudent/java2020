package lesson201209.homework.employee.engineer;

public class DevOpsEngineer extends Engineer {

	
	public DevOpsEngineer(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}
	
	@Override
	public void mainJob() {
		System.out.println("Builds environment for system and deployes it");
	}

	@Override
	public void doJob(String task) {
		System.out.println("Deploying completed functionality of the task: " + task);
	}

	@Override
	public void createsDocumentation() {
		System.out.println("Writes documentation about CI/CD for software");
	}

	@Override
	public void holdsWorkshop() {
		System.out.println("Talks about the best practices and tools to make "
				+ "CI/CD process more efficient and less expensive");
	}

}
