package lesson201029;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		int x = 1001;
		
		if (x >= 0 && x <= 100) {
			System.out.println("it's ok");
		} else {
			System.out.println("invalid number");
		}
		
		String s = "hello";
		String s2 = null;

		check(s);
		check(s2);
		
	}

	private static void check(String s) {
		if (s != null && s.length() > 5) { // short circuit
			System.out.println("this is long string");
		} else {
			System.out.println("short string");
		}
	}

}
