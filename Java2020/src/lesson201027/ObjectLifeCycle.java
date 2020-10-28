package lesson201027;

public class ObjectLifeCycle {
	
	static A globalA = new A();
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Object o = Object();
		Object o2 = new Object();

		o = null;
		o2 = null;
		
		while (true) {
			new A();
		}
		
		
	}

	private static Object Object() {
		return globalA;
	}

}


class A {
	
	static int counter = 0;
	
	@Override
	protected void finalize() throws Throwable {
		counter++;
		if (counter % 10000 == 0) {
			System.out.println(counter);
		}
		super.finalize();
	}
	
}