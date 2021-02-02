package lesson210201;

public class Sequential {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Usage: add two int params <x> and <y>");
			return;
		}

		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = calculation(x, y);
			System.out.println(z);
		} catch (NumberFormatException nfe) {
			System.err.println(nfe.toString());
			return;
		}

	}

	private static int calculation(int x, int y) {
		int z = x * y;
		return z;
	}

}
