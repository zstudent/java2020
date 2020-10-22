package lesson201022;

public class UseABC {
	
	public static void main(String[] args) {
		A a;
		// ....
		
		a = new A();
		
		process(a);
		process(new B());
		
		C c = new C();
		
	}

	private static void process(A a) {
		a.m1();
	}

}
