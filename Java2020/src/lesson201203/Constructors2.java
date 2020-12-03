package lesson201203;

public class Constructors2 {
	
	public static void main(String[] args) {
		
		D d = new D();
		System.out.println("---");
		d = new D(0);
		
	}

}

class C extends Object {
	
	public C(int n) {
		super();
		System.out.println("C");
	}
	
}


class D extends C {
	
	public D() {
		super(0);
		System.out.println("D");
	}
	
	public D(int x) {
		this();
	}
	
}