package lesson201026;

public class MessagePassing {
	
	public static void main(String[] args) {
	
		D d = new D();
		process(d);
		process(null);
//		process(new B());  ERROR: type safety
	}

	private static void process(D d) {
		// something before
		d.m();
		// something after
	}

}


class D {
	public void m() {
		System.out.println("here I am");
	}
}
