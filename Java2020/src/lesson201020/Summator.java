package lesson201020;

public class Summator {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Usage: Summator <int1> <int2>");
			return;
		}

		int a = Integer.parseInt(args[0], 2);
		int b = Integer.parseInt(args[1], 2);
		int sum = a + b;
		System.out.println("sum=" + Integer.toString(sum, 16));
	}

}

class X {
}

class X2 {
}

class X3 {
}
