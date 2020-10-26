package lesson201026;

public class A {

	public A(int x) {
		System.out.println("constructor");
	}
	
	{ // instance initializer block
//		System.out.println(k);
		k = 20;
		System.out.println("init");
	}
	
	int k = 10;
}
