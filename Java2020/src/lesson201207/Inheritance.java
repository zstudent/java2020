package lesson201207;

public class Inheritance {
	
	public static void main(String[] args) {
		A a = new A();
		a.behavior();
		System.out.println(a.state);
		
		B b = new B();
		b.behavior();
		b.b2();
		System.out.println(b);
		
	}
	

}


class A {   // parent class, ancestor
	int state;
	
	void behavior() {
		state++;
	}
	
}


class B extends A { // child class,  descendant
	int state2;
	
	void b2() {
		state--;
		state2++;
	}
	
	@Override
	void behavior() {
		state = (state + 1) * 2;
	}
	
	@Override
	public String toString() {
		return "[" + state + ", " + state2 + "]";
	}
	
}