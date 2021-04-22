package lesson210422;

public class Question_5_7 {
	
	public static void main(String[] args) {
		
		A a = new A();
//		B b = (B)a;  run-time exception: class cast!
		
		process(a);
		process(new B());
		process(new C());
		process(new D());
		
	}

	private static void process(A a) {
		System.out.println(a);
		a.m();
	}

}


class A {
	
	public void m() {
		System.out.println("A");
	}
	
}


class B extends A {
	@Override
	public void m() {
		System.out.println("B");
	}
	
}

class C extends B {
	
}

class D extends C {
	
}