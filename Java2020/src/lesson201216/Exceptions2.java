package lesson201216;

public class Exceptions2 {

	public static void main(String[] args) {
		try {
			long result = calculate(10, 0);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("continue...");
		long result = calculate(10, 0);
		System.out.println("continue again...");
	}
	
	static long calculate(long x, long y) {
//		if (y == 0) {
//			throw new IllegalArgumentException("y cannot be zero");
//		}
		return x / y;
	}
	

}
