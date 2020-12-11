package lesson201209.homework.employee;

public abstract class Employee {
	
	protected String firstName;
	protected String lastName;
	protected int workingHours;
	protected String position;
	
	
	public abstract void mainJob();
	
	public abstract void doJob(String task);
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb
		.append("First Name : " + this.firstName + "\n")
		.append("Last Name: " + this.lastName + "\n")
		.append("Position: " + this.position + "\n")
		.append("Working hours: " + this.workingHours + "\n");
		return sb.toString();
	}
}
