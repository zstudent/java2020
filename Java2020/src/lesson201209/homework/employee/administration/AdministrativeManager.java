package lesson201209.homework.employee.administration;

public class AdministrativeManager extends Administrative {
	
	
	public AdministrativeManager(String firstName, String lastName, int workingHours, String position,
			double amountOfExperience) {
		super(firstName, lastName, workingHours, position, amountOfExperience);
	}

	@Override
	public void mainJob() {
		System.out.println("Supervises daily support operations of the company"
				+ " and plans the most efficient administrative procedures ");
	}
}
