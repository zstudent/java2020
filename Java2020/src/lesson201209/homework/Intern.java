package lesson201209.homework;

public class Intern extends Employee {

	
	public Intern(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}
	
	@Override
	void mainJob() {
		System.out.println("Watchs trainings and does homeworks");
	}

	@Override
	void doJob(String task) {
		System.out.println("Starting doing homework: " + task);
	}

}
