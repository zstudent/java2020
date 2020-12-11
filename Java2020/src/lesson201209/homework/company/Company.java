package lesson201209.homework.company;

import java.util.List;

import lesson201209.homework.employee.Employee;

public abstract class Company {
	
	String name;
	String ceo;
	String origin;
	
	abstract void hireEmployee(Employee employee);
	
	abstract void hireEmployees(List<Employee> employees);
	
	abstract void fireEmployee(Employee employee);
	
	abstract void providesTrainings();
	
}
