package lesson201026;

public class PrimitiveLiterals {
	
	public static void main(String[] args) {
		byte b = 0;    // 8 bits  255 values
		b = -128; b = 127;
		short s = 16_000; // 16 bits
		int i = Integer.MIN_VALUE;
		i = Integer.MAX_VALUE;
		long l = 3_000_000_000L;
		
		int j = 0777; // octal, base 8
		System.out.println(j);
		j = 0xFFF; // hexadecimal, base 16
		System.out.println(j);
		j = 0b101010; // binary, base 2
		System.out.println(j);
		System.out.println(Integer.toHexString(j));
		System.out.println(Integer.toString(j,2));
		System.out.println(Integer.toString(j,3));
	}

}
