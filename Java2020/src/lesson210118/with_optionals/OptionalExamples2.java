package lesson210118.with_optionals;

import java.util.Optional;

public class OptionalExamples2 {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		System.out.println(getCarInsuranceName(person));
		
		Car car = new Car();
//		value = null;
		
		person.car = Optional.ofNullable(car);
		
		System.out.println(getCarInsuranceName(person));

		
		car.insurance = Optional.ofNullable(new Insurance("GPI"));
		
		System.out.println(getCarInsuranceName(person));
	}

	private static String getCarInsuranceName(Person person) {
		return person
				.getCar()
				.flatMap(Car::getInsurance)
				.map(Insurance::getName)
				.orElse("Unknown");
	}

}
