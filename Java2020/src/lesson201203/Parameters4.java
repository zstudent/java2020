package lesson201203;

public class Parameters4 {
	
	static int counter = 0;
	
	public static void main(String[] args) {
		
		doIt();
		doIt();
		doIt();
		doIt();
		
		doIt(counter);
		doIt(counter);
		doIt(counter);

		System.out.println(counter);
		
		Counter c = new Counter();
		
		doIt(c);
		doIt(c);
		doIt(c);
		doIt(c);
		doIt(c);
		doIt(c.get());
		doIt(c.get());
		
		System.out.println(c.get());
	}


	private static void doIt() {
		counter++;
	}

	private static void doIt(int c) {
		c++;
	}
	
	private static void doIt(Counter c) {
		c.set(c.get() + 1);
	}
}

class Counter {
	private int counter;

	int get() {
		return counter;
	}

	void set(int counter) {
		this.counter = counter;
	}
}










