package lesson201209.homework.company;

import java.util.ArrayList;
import java.util.List;

import lesson201209.homework.employee.Employee;
import lesson201209.homework.employee.engineer.Engineer;

public class SoftwareDevelopment extends Company {
	
	private List<Employee> employees = new ArrayList<Employee>();
	private List<Engineer> engineers = new ArrayList<Engineer>();
	
	public SoftwareDevelopment(String name, String ceo, String origin) {
		this.name = name;
		this.ceo = ceo;
		this.origin = origin;
	}


	@Override
	public void hireEmployee(Employee employee) {
		getEmployees().add(employee);
	}


	@Override
	public void hireEmployees(List<Employee> employees) {
		this.getEmployees().addAll(employees);
	}


	@Override
	public void fireEmployee(Employee employee) {
		getEmployees().remove(employee);
	}


	@Override
	void providesTrainings() {
		System.out.println("Providing trainings for software developers, business analysts and quality assurance specialists");
	}


	public List<Engineer> getEngineers() {
		employees.forEach(empl -> {
			if (empl instanceof Engineer) {
				engineers.add((Engineer)empl);
			}
		});
		return engineers;
	}
	
	
	public List<Employee> getEmployees() {
		return employees;
	}
		
	
	
	

}
