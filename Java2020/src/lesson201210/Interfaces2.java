package lesson201210;

public class Interfaces2 {

	public static void main(String[] args) {
		
		Object o;
		I i;
		A a = new A();
		B b = new B();
		
		i = a;
		i = b;
		
		o = i;
		o = a;
		
		o = new C();
		
		i = (I)o;
		
	}
	
}

interface I {}

class A implements I {}

class B implements I {}

class C extends A {}