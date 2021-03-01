package lesson210301;

import java.util.Arrays;

public class Question08 {

	public static void main(String[] args) {
		Integer i1 = Arrays.asList(1, 2, 3, 4, 5).stream().findAny().get();
		synchronized (i1) { // y1
			Integer i2 = Arrays.asList(6, 7, 8, 9, 10)
					.parallelStream()
					.sorted() // y2
					.findAny().get(); // y3
			System.out.println(i1 + " " + i2);
		}
	}

}
