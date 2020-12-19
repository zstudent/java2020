package lesson201215;


public class Dog { // STate design pattern
	
	private interface Brain {
		void stroke();
		void feed();
	}

	private class Fed implements Brain {  // inner class
		@Override
		public void stroke() {
			wag(); wag();
//			Dog.this.brain = Dog.this.new Hungry();
			brain = new Hungry(Dog.this);
		}

		@Override
		public void feed() {
			bark(); wag();
		}

	}

	
	private static class Hungry implements Brain { 
		
		private Dog dog;

		public Hungry(Dog dog) {
			this.dog = dog;
		}
		
		@Override
		public void stroke() {
			dog.bite();
		}

		@Override
		public void feed() {
			dog.eat(); dog.wag();
			dog.brain = dog.new Fed();
		}
		
	}

	private Brain brain = new Hungry(this);
	
	
	public void stroke() {
		brain.stroke();
	}
	
	public void feed() {
		brain.feed();
	}
	
	// body reactions 
	
	private void bark() {
		System.out.println("dogs barks");
	}

	private void wag() {
		System.out.println("dog wags");
	}

	private void eat() {
		System.out.println("dog eats");
	}

	private void bite() {
		System.out.println("dog bites");
	}
	

}
