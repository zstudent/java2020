package lesson201215;

public class MoreAnonymousClasses {
	
	public static void main(String[] args) {
		
		I i = new I() {
			@Override
			public void i() {
				System.out.println("i");
			}
		};
		
		A a = new A() {
			@Override
			void a() {
				System.out.println("a");
			}
		};
		
		B b = new B() {
			@Override
			void b() {
				System.out.println("b");
			}
		};
		
	}

}


interface I {
	void i();
}

abstract class A {
	abstract void a();
}

class B {
	void b() {}
}