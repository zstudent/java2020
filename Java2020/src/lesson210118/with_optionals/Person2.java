package lesson210118.with_optionals;

import java.util.Optional;

public class Person2 {
	private Car car;

	public Optional<Car> getCarOpt() {
		return Optional.ofNullable(car);
	}

}
