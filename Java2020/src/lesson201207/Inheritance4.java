package lesson201207;

import java.util.Arrays;
import java.util.List;

public class Inheritance4 {
	
	public static void main(String[] args) {
		
		List<A> listOfAs = Arrays.asList(new A(), new B(), new C());
		
		listOfAs.forEach(a -> a.m());
		listOfAs.forEach(a -> a.m2());
		
	}
	
	static class A {
		void m() {
			System.out.println("A");
		}
		void m2() {
			System.out.println("A.m2");
		}
	}
	
	static class B extends A {
		@Override
		void m() {
			System.out.println("B");
		}
	}
	
	static class C extends B {
//		@Override
//		void m() {
//			System.out.println("C");
//		}
		
		@Override
		void m2() {
			System.out.println("C.m2");
		}
	}

}
