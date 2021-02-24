package lesson210118.with_optionals;

import java.util.Optional;

public class Car {
	Optional<Insurance> insurance = Optional.empty();

	public Optional<Insurance> getInsurance() {
		return insurance;
	}
}
