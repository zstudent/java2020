package lesson201026;

public class C {
	
	public C() {
		n = 5;
	}
	
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.n);
	}
	
	private int n = 3;
	
	{ n = 4; }

}
