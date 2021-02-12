package lesson210212;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class FairenessExampleWithLock {
	
	public static void main(String[] args) {
		
		Lock m = new ReentrantLock(true);
		
		Runnable r = () -> {
			String name = Thread.currentThread().getName();
			System.out.println("beginning: " + name);
			m.lock();
			try {
				System.out.println("synched: " + name);
				Time.pause(1000);
			} finally {
				otherMethod(m);
			}
		};

		m.lock();
		try {
			new Thread(r).start();
			Time.pause(1000);
			new Thread(r).start();
			Time.pause(1000);
			new Thread(r).start();
			Time.pause(1000);
			new Thread(r).start();
			Time.pause(1000);
		} finally {
			otherMethod(m);
		}
		
	}

	private static void otherMethod(Lock m) {
		m.unlock();
	}

}
