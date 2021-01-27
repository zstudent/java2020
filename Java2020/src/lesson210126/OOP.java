package lesson210126;

public class OOP {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		A a2 = new B();
		///
		a2 = a;
		///
//		a2.b();
		a2.hashCode();
		
	}

}

class A extends Object {
	
	void a() {}
	
}

class B extends A {
	void b() {}
}