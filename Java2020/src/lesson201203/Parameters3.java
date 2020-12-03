package lesson201203;

public class Parameters3 {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		doIt(x);
		
		System.out.println(x);
		
	}

	private static void doIt(int x) {
		x = x * 2;
	}

}
