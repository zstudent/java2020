package lesson210118.with_optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalExamples3 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		
		p1.car = Optional.ofNullable(car1);
		p2.car = Optional.ofNullable(car2);
		p3.car = Optional.ofNullable(car3);
		p4.car = Optional.ofNullable(car4);
		
		Insurance ins1 = new Insurance("TBC");
		Insurance ins2 = new Insurance("GPI");
		
		car1.insurance = Optional.ofNullable(ins1);
		car2.insurance = Optional.ofNullable(ins2);
		car4.insurance = Optional.ofNullable(ins1);
		
		List<Person> list = Arrays.asList(p1, p2, p3, p4, p5);
		
//		Stream<Optional<Car>> s1 = list.stream()
//			.map(Person::getCar);
//		
//		Stream<Optional<Insurance>> s2 = s1.map(o -> o.flatMap(Car::getInsurance));
//		
//		Stream<Optional<Insurance>> s2a = s2.filter(o -> o.isPresent());
//		
//		Stream<Optional<String>> s3 = s2a.map(o -> o.map(Insurance::getName));
//		
//		Stream<String> s4 = s3.map(o -> o.orElse("Unknown"));
//		
//		List<String> names = s4
//				.distinct()
//				.collect(Collectors.toList());

		List<String> names = list
				.stream()
				.map(Person::getCar)
				.map(o -> o.flatMap(Car::getInsurance))
				.filter(Optional<Insurance>::isPresent)
				.map(o -> o.map(Insurance::getName))
				.map(Optional<String>::get)
				.distinct()
				.collect(Collectors.toList());
			
		System.out.println(names);
		
	}

}
