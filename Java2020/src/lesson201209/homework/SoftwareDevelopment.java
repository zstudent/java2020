package lesson201209.homework;

import java.util.ArrayList;
import java.util.List;

public class SoftwareDevelopment extends Company {
	
	List<Employee> employees = new ArrayList<Employee>();
	
	public SoftwareDevelopment(String name, String ceo, String origin) {
		this.name = name;
		this.ceo = ceo;
		this.origin = origin;
	}


	@Override
	void hireEmployee(Employee employee) {
		employees.add(employee);
	}


	@Override
	void hireEmployees(List<Employee> employees) {
		this.employees.addAll(employees);
	}


	@Override
	void fireEmployee(Employee employee) {
		employees.remove(employee);
	}


	@Override
	void providesTrainings() {
		System.out.println("Providing trainings for software developers, business analysts and quality assurance specialists");
	}
		
	
	
	

}
