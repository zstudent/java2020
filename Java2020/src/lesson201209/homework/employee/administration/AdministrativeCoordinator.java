package lesson201209.homework.employee.administration;

public class AdministrativeCoordinator extends Administrative {
	
	public AdministrativeCoordinator(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}
	

	@Override
	public void mainJob() {
		System.out.println("Serves as a point of contact and link between"
				+ " employees, internal departments, and external parties, including"
				+ " vendors, lenders, and customers");
	}
}
