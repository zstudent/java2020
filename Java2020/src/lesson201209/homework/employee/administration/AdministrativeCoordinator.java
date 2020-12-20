package lesson201209.homework.employee.administration;

public class AdministrativeCoordinator extends Administrative {
	

	

	public AdministrativeCoordinator(String firstName, String lastName, int workingHours, String position,
			double amountOfExperience) {
		super(firstName, lastName, workingHours, position, amountOfExperience);
	}

	@Override
	public void mainJob() {
		System.out.println("Serves as a point of contact and link between"
				+ " employees, internal departments, and external parties, including"
				+ " vendors, lenders, and customers");
	}
}
