package lesson210204;

import java.util.Vector;

public class VectorExample {
	
	private static final int SIZE = 10_000_000;

	public static void main(String[] args) throws InterruptedException {
		
		Vector<Integer> v = new Vector<Integer>();
		
		long start = System.currentTimeMillis();
		
			for (int i = 0; i < SIZE; i++) {
				v.add(i);
			}

			for (int i = 0; i < SIZE; i++) {
				v.add(i);
			}
		
//		Thread t1 = new Thread(() -> {
//			for (int i = 0; i < SIZE; i++) {
//				v.add(i);
//			}
//		});
//		
//		t1.start();
//		
//		Thread t2 = new Thread(() -> {
//			for (int i = 0; i < SIZE; i++) {
//				v.add(i);
//			}
//		});
//		
//		t2.start();
//		
//		t1.join();
//		t2.join();
		
		long stop = System.currentTimeMillis();
		
		System.out.println("Elapsed: " + (stop - start));
	}

}
