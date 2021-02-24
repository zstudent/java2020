package lesson210203.mutex_encapsulation;

import utils.Time;

public class Counter2 implements Runnable {
	
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
		synchronized (CounterHolder.class) {
			int t = CounterHolder.counter;
			t++;
			CounterHolder.counter = t;
		}
	}
	
}