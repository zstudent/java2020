package lesson210504;

public class Polymorphism {
	
	public static void main(String[] args) {
		A a = new A();
//		B b = (B)a;
		// ...
//		b.b();
		
		process(a);
		process(new B());
		process(new Object());
		process("hello");
		
		a = new B();
		
		a.a();
		
	}
	
	static void process(Object o) {
		System.out.println(o.hashCode());
	}
	
}


class A {
	final public void a() {
		System.out.println("a");
	}
}

class B extends A {
	public void b() {}
//	public void a() {   // comliler error! can't override final
//		System.out.println("a-b");
//	}
}