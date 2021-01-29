package lesson210129;

public class Question15 {
	
	public static void main(String[] args) {
		
		A1 a = new B();
//		B b = (B)a;
		
		a.x();
		a.y();
		((B)a).z();
	}

}

class A1 {
	public void x() {
		System.out.println("A1");
	}
	public void y() {
		System.out.println("A1");
	}
}

class B extends A1 {
	public void x() {
		System.out.println("B");
	}
	public void z() {
		System.out.println("B");
	}
}
