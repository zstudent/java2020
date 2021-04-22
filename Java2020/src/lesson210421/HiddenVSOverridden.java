package lesson210421;

public class HiddenVSOverridden {
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		a.doIt();
		b.doIt();
		
	}

}


class A {
	public A() {
		System.out.println(i);
	}
	private void m() {
		System.out.println("A");
	}
	
	public void doIt() {
		m();
	}
	
	public int j;
	private int i = 10;
}

class B extends A {
	private void m() {
		System.out.println("B");
	}
	
	private int i;
	public int j;
}