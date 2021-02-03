package lesson210203;

import java.util.Arrays;

import utils.Time;

public class RaceCondition2 {
	
	static int counter = 0;
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Object mutex = new Object();
		
		new Thread(new Counter2(mutex)).start();
		new Thread(new Counter2(mutex)).start();
		
		int i = 0;
		
		Time.pause(3000);
		
		synchronized (mutex) { // BAD CODE!  locks mutex forever
			while (true) {
				Time.pause(500);
				System.out.println((i++) + " " +counter);
			}
		}
		
	}

}

class Counter2 implements Runnable {
	
	private Object mutex;

	public Counter2(Object mutex) {
		this.mutex = mutex;
	}
	
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
			int t = RaceCondition2.counter;
			t++;
			RaceCondition2.counter = t;
		}
	}
	
}

