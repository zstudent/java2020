package lesson201208.hiding;

public class Demo {
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		A t = b;
		
		A.s();
		B.s();
		
		a.s();  // A.s()
		b.s();  // B.s()
		t.s();  // A.s()
		
		D d = new D();
		
		d.c();
		d.d();
		
		
		
		
		
		
		
		
		
	}

}
