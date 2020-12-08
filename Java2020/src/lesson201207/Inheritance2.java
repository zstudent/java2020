package lesson201207;

public class Inheritance2 {
	
	public static void main(String[] args) {
		B b = new B();
		b.m();
		b.m2();
	}
	
	static class A {
		
		void m() {
			System.out.println("A");
		}
		
	}
	
	static class B extends A {
		
		@Override
		void m() {
			System.out.println("B");
		}
		
		void m2() {
			super.m();
			super.m();
			super.m();
		}
		
	}
	
	static class C extends A {
		@Override
		void m() {
			System.out.println("C");
			super.m();
		}
		
	}
	
	static class D extends A {
		@Override
		void m() {
			super.m();
			System.out.println("D");
		}
	}

}


//class A {}  can't use: already defined


