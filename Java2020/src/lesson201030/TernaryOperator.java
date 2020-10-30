package lesson201030;

public class TernaryOperator {
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("USAGE: <param1> <param2>");
			return;
		}

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		System.out.println(check(x,y));

	}

	private static boolean check(int x, int y) {
		return x % y == 0 ? true : false;
		// better way is to return just x % y == 0
	}

}
