package lesson210126;

import java.util.stream.Stream;

public class Polymorphism {
	
	public static void main(String[] args) {
		
		Stream<Pet> stream = Stream.of(new Dog(), new Cat());
		stream.forEach(Pet::care);
		
		Pet pet = new Dog();
		((Dog)pet).walk();
	}

}

abstract class Pet {
	abstract void care();
	abstract void feed();
	abstract void play();
}

class Cat extends Pet {

	@Override
	void care() {
		feed();
		play();
	}

	@Override
	void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}
	
}

class Dog extends Pet {

	@Override
	void care() {
		walk();
		play();
		feed();
	}

	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}
	
}