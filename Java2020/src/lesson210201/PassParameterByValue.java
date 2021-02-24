package lesson210201;

public class PassParameterByValue {
	
	public static void main(String[] args) {
		int x = 10;
		calc(x); 
		System.out.println(x);
	}

	private static void calc(final int x) {  // local.x = 10
//		x = 20;  ERROR!
	}

}
