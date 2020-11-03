package lesson201103;

public class NestedLoops {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < 1000000; i++) {

			int c = 0;

			for (;;) {
				c++;
				if (Math.random() < 0.01) {
					break;
				}
			}

//			System.out.println(c);
			
			sum += c;

		}
		
		System.out.println("average: " + sum / 1000000);

	}

}
