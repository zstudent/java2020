package lesson201022;

public class PrimitivesVsReferences {
	
	public static void main(String[] args) {
		
		int x = 10;   // 32 bits
		long l = 10L; // 64 
		char c = 'c'; // 16
		c = 10; 
		short s = 40; // 16
		byte b = 9;  // 8
		float f = 10.0f; // 32
		double d = 10.0; // 64
		boolean bool = true; // byte == 8 bits 
		String str = "Hello";
	}

}
