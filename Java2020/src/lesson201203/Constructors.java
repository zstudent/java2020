package lesson201203;

public class Constructors {
	
	public static void main(String[] args) {
		A a = new A(); // default constructor
		
		B b = new B();
	}

}


class A {
	int x, y;
	{
		System.out.println(x + " " + y);
	}
	
	public A() {
		System.out.println("constructor: " + x + " " + y);
	}
	
	public void A() {}
	
	public A(int x, int y) {
		
	}
}


class B {
	
	public void B() {
		System.out.println("hello!");
	}
	
}