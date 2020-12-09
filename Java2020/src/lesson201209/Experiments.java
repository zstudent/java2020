package lesson201209;

public class Experiments {
	
	
	private static abstract class A {
		
//		abstract private void m();   ERROR:  private and abstract do not fit.
		
	}
	
	static class B extends A {}
	
//	final static abstract class C {}  ERROR:  no final and abstract together

}
