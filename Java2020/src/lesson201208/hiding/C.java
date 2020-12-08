package lesson201208.hiding;

public class C {
	
	static boolean isSpecial() { return false; }
	
	void c() {
		System.out.println("C " + isSpecial());
	}

}
