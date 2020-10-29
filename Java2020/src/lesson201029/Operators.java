package lesson201029;

public class Operators {
	
	public static void main(String[] args) {
		
		int y = 4;  // 32 bits , leftmost bit is for sign
		
		double x = 3 + 2 * --y;  // real numbers (float & double)
		
		System.out.println(x);
		
		long z = y;
		
		z = 3_000_000_000L;
		
		int i = (int)z;
		
		System.out.println(i);
		
	}

}
