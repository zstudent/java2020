package lesson210202;

public class StackOverflow {
	
	public static void main(String[] args) {
		
		calc(0);
		
	}

	private static void calc(int i) {
		System.out.println(i);
		calc(i + 1);
	}

}
