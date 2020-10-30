package lesson201030;

public class Loop {

	public static void main(String[] args) {

		int x = 0;
		//		LOOP: if (x == 10) {
		//			return;
		//		}
		//		System.out.println(x);
		//		x = x + 1; // x++  x += 1
		//		goto LOOP;

		while (x != 10) {
			System.out.println(x++);
		}

		do {
			System.out.println(x--);
		} while (x > 0);
	}

}
