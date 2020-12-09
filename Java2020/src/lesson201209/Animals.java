package lesson201209;

import java.util.Arrays;
import java.util.List;

public class Animals {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Mammal m;
//		m = new Mammal();   ERROR: can't instantiate
		Animal a;
//		a = new Animal();   ERROR:  can't instantiate
		
		m = cat;
		
		a = dog;
		
		List<Animal> animals = Arrays.asList(cat, dog, new Sparrow());
		
		animals.forEach(Animal::eat);
	}
}
