package lesson210203;

import java.util.Arrays;

import utils.Time;

public class RaceCondition3 {
	
	static int counter = 0;
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		new Thread(new Counter3()).start();
		new Thread(new Counter3()).start();
		
		int i = 0;
		
		synchronized (Counter.class) { // BAD CODE!  locks mutex forever
			while (true) {
				Time.pause(500);
				System.out.println((i++) + " " +counter);
			}
		}
		
	}

}

class Counter3 implements Runnable {
	
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
		synchronized (Counter.class) {
			int t = RaceCondition3.counter;
			t++;
			RaceCondition3.counter = t;
		}
	}
	
}

