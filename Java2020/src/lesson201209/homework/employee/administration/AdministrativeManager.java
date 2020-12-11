package lesson201209.homework.employee.administration;

public class AdministrativeManager extends Administrative {

	public AdministrativeManager(String firstName, String lastName,
			int workingHours, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
	
	}
	
	
	@Override
	public void mainJob() {
		System.out.println("Supervises daily support operations of the company"
				+ " and plans the most efficient administrative procedures ");
	}
}
