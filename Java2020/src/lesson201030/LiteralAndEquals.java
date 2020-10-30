package lesson201030;

public class LiteralAndEquals {

	public static void main(String[] args) {

		isItOne("one");
		isItOne("two");
		isItOne(null);

		int x = 10;

		if (0 == x) {
			System.out.println(x);
		}

	}

	private static void isItOne(String s) {
		if ("one".equals(s)) {
			System.out.println(1);
		} else {
			System.out.println("not one");
		}
	}

}
