package lesson210219;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class SemaphoreExamples2 {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		Lock lock = new ReentrantLock();
		Condition signal = lock.newCondition();
		
		new Thread(() -> {
			System.err.println("waiting for a signal to start..");
			lock.lock();
			try {
				signal.awaitUninterruptibly();
			} finally {
				lock.unlock();
			}
			System.err.println("got persmission to start!");
			// do something here
		}).start();
		
		Time.pause(3000);

		lock.lock();
		try {
			signal.signal();
		} finally {
			lock.unlock();
		}
	}

}
