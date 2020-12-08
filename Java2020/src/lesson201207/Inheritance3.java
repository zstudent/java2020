package lesson201207;

public class Inheritance3 {
	
	static class A {
		void m() {
			special();
		}

		final protected void special() {
			System.out.println("A");
		}
	}
	
	static class B extends A {
		@Override
		void m() {
			super.m();
		}
	}
	
	static class C extends B {
		@Override
		void m() {
//			super.super.m();   compile error
			special();
		}
		
	}

}
