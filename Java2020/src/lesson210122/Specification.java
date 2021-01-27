package lesson210122;

public class Specification {

}


abstract class Animal {
	abstract void eat(); 
	// here we specify what children must be able to do
}

class Cat extends Animal {

	@Override
	void eat() {
		System.out.println("eats");
	}
	
}