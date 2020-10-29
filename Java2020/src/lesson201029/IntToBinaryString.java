package lesson201029;

public class IntToBinaryString {
	
	public static void main(String[] args) {
		
		
		int i = 7;  // 1111 1111   2**8 - 1  0xFF
		
		String s = binary(i);
		
		System.out.println(s);

		System.out.println(binary(i,8));
		
	}

	private static String binary(int i, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String binary(int i) {
		String r = "";
		int x = i;
		while (x > 0) {
			int lastBit = x & 1;
			String currentBit = lastBit == 0 ? "0" : "1";
			r = currentBit + r; // ternary operator
			x >>= 1; // x = x >> 1
		}
		return r;
	}

}
