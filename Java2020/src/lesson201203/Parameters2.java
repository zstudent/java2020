package lesson201203;

public class Parameters2 {
	
	public static void main(String[] args) {
		
		int result;
		int tmp =  doubleIt(10);
		result = tmp;
		
		int x = 100;
		
		result = doubleIt(x);
		
	}

	private static int doubleIt(int i) {
		return i * 2;
	}

}
