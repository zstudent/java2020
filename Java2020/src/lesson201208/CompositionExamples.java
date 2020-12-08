package lesson201208;

public class CompositionExamples {
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.other();
		b.doIt();
		// ???
		b.doIt();
		C c = new C();
		c.doIt();
		
		new D(b).doIt();
		new D(new A()).doIt();
		
		E e = new E(b);
		e.doIt();
		e.set(new A() {
			@Override
			void doIt() {
				System.out.println("my custom stuff");
			}
		});
		e.doIt();

		
		
	}

}

class A {
	void doIt() { System.out.println("A");}
}

class B extends A {
	
	@Override
	void doIt() {
		System.out.println("do it from B");
		super.doIt();
	}
	
	void other() {System.out.println("other from B");}
}

class C {
	
	A a = new A();  // static dependency
	
	void doIt() {
		a.doIt();
	}
}


class D {
	
	A a;
	
	public D(A a) {
		this.a = a;
	}
	
	void doIt() {
		a.doIt();
	}
}

class E {
	A a;
	public E(A a ) { this.a = a; }
	void set(A a) { this.a = a; }
	void doIt() { a.doIt(); }
}












