package lesson210202;

public class TooManyThreads {

	public static void main(String[] args) {

		int x = 0;
		
		while (true) {
			new Thread(() -> {
				while (true) {
				}
			}).start();
			System.out.println(++x);
		}

	}

}
