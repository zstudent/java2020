package lesson210203;

import java.util.Arrays;

import utils.Time;

public class RaceCondition4 {
	
	static int counter = 0;
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		new Thread(new Counter4()).start();
		new Thread(new Counter4()).start();
		
		int i = 0;
		
		synchronized (Counter.class) { // BAD CODE!  locks mutex forever
			while (true) {
				Time.pause(500);
				System.out.println((i++) + " " +counter);
			}
		}
		
	}

}

class Counter4 implements Runnable {
	
	private final static Object mutex = new Object();
	
	@Override
	public void run() {
		loop();
	}

	private void loop() {
		System.out.println(Thread.currentThread());
		while (true) {
			Time.pause(500);
			readIncrementStore();
		}
	}

	private void readIncrementStore() {
		synchronized (mutex) {
			int t = RaceCondition4.counter;
			t++;
			RaceCondition4.counter = t;
		}
	}
	
}

