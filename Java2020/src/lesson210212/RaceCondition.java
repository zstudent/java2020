package lesson210212;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class RaceCondition {
	
	static int counter = 0;
	
	public static void main(String[] args) {
		
		CounterChanger changer = new CounterChanger();
		new Thread(changer).start();
		new Thread(changer).start();
		
		int i = 0;
		while (true) {
			Time.pause(500);
			System.out.println((i++) + " " +counter);
		}
		
	}

}

class CounterChanger implements Runnable {
	
	private Lock lock = new ReentrantLock();
	
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
//		synchronized (Counter.class) {
//			int t = RaceCondition.counter;
//			t++;
//			RaceCondition.counter = t;
//		}

		lock.lock();
		try {
			int t = RaceCondition.counter;
			t++;
			RaceCondition.counter = t;
		} finally {
			lock.unlock();
		}
	}
	
}

