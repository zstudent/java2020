package lesson201209.homework;

public class QualityAssuranceSpecialist extends Employee {
	
	public QualityAssuranceSpecialist(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}

	@Override
	void mainJob() {
		System.out.println("Checks quality of the system");
	}

	@Override
	void doJob(String task) {
		System.out.println("Starting checking of: " + task);
	}

}
