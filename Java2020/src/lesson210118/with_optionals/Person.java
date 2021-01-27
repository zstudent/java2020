package lesson210118.with_optionals;

import java.util.Optional;

public class Person {
	Optional<Car> car = Optional.empty();

	public Optional<Car> getCar() {
		return car;
	}

}
