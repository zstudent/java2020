package lesson201209.homework.employee;

public abstract class Employee implements Comparable<Employee>{
	
	protected String firstName;
	protected String lastName;
	protected int workingHours;
	protected String position;
	protected double amountOfExperience;
	
	public Employee(final String firstName, final String lastName, final int workingHours,
			final String position, final double amountOfExperience) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingHours = workingHours;
		this.position = position;
		this.amountOfExperience = amountOfExperience;
	}
	
	
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
	
	@Override
	public int compareTo(Employee o) {
		double compare = this.amountOfExperience - o.amountOfExperience;
		if (compare < 0) {
			return -1;
		} else if (compare > 0) {
			return 1;
		} 
		return 0;
	}
}
