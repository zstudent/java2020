package lesson201209.homework;

public abstract class Employee {
	
	String firstName;
	String lastName;
	int workingHours;
	String position;
	
	
	abstract void mainJob();
	
	abstract void doJob(String task);
	
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
