package lesson201204.encapsulation.package2;

import lesson201204.encapsulation.package1.A;

public class UseA {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		A.x = 10;
		
		A.doIt();
		
		A.B ab = new A.B();
		
//		A.C ac;  A.C is not visible, ERROR
		
//		A.P ap;  not compiled: not visible
		
	}

}
