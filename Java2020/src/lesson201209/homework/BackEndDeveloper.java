package lesson201209.homework;

public class BackEndDeveloper extends Employee{
	
	
	public BackEndDeveloper(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}

	@Override
	void mainJob() {
		System.out.println("Builds microservices and provides them to outer world");
	}

	@Override
	void doJob(String task) {
		System.out.println("Starting building microservices for following task: " + task);
	}
	
	

}
