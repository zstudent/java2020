package lesson210211;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

import utils.Time;

public class RaceCondition1 {
	
	static AtomicInteger counter = new AtomicInteger(0);
	
	public static void main(String[] args) {
		
		new Thread(new Counter()).start();
		new Thread(new Counter()).start();
		
		int i = 0;
		while (true) {
			Time.pause(500);
			System.out.println((i++) + " " + counter.get());
		}
		
	}

}

class Counter implements Runnable {
	
	static {
		System.out.println(Counter.class);
		System.out.println(Arrays.toString(Counter.class.getMethods()));;
	}

	@Override
	public void run() {
		loop();
	}

	static private void loop() {
		System.out.println(Thread.currentThread());
		while (true) {
			Time.pause(500);
			RaceCondition1.counter.incrementAndGet();
		}
	}

	
}

