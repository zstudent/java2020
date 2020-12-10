package lesson201209.homework;

import java.util.List;

public abstract class Company {
	
	String name;
	String ceo;
	String origin;
	
	abstract void hireEmployee(Employee employee);
	
	abstract void hireEmployees(List<Employee> employees);
	
	abstract void fireEmployee(Employee employee);
	
	abstract void providesTrainings();
	
}
