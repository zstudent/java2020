package lesson201208.hiding;

public class D extends C {
	
	static boolean isSpecial() { return true; }
	
	void d() {
		System.out.println("D " + isSpecial());
	}

}
