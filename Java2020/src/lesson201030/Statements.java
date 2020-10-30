package lesson201030;

public class Statements {

	public static void main(String[] args) {

		int x = 10;

		x = x + 10;
		x -= 3;

		if (x > 10) {
			System.out.println(x);
			x--;
		}

		if (x < 0) {
			x = 0;
		} else {
			x = 1;
		}

		Statements.process(x);

		return;

	}

	private static void process(int x) {
		System.out.println(x);
		return;
	}

}
