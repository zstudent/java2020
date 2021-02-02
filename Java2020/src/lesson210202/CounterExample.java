package lesson210202;

import utils.Time;

public class CounterExample {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Counter counter = new Counter();
		
		new Thread(counter).start();
		
//		while (true) {
//			Time.pause(1000);
//			System.out.println(counter.counter);
//		}
		long c = 0;
		while (true) {
			long t = counter.counter; // read STALE values
			if (t != c && t % 1_000_000_000 == 0) {
				System.out.println(t);
				c = t;
			}
		}
	}

}


class Counter implements Runnable {
	
	volatile long counter;
	long cnt;

	@Override
	public void run() {
		while (true) {
			if (++cnt % 1_000_000 == 0) {
				counter = cnt;
			}
		}
	}
	
}











