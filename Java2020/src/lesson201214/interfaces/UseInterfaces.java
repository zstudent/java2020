package lesson201214.interfaces;

public class UseInterfaces {
	
	public static void main(final String[] args) {
		
		final B b = new B();
		
		System.out.println(b.calculate(10));
		
	}

}

abstract class A implements DefaultMethods {
	
}


class B extends A {

	@Override
	public int process(final int y) {
		return 10;
	}
	
//	@Override
//	public int calculate(final int x) {
//		return -x;
//	}
	
}