package lesson210212;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class InterruptableExamplesWithLock2 {

	public static void main(String[] args) {

		System.out.println("start");

		Lock mutex = new ReentrantLock();

		Thread t = new Thread(() -> {
			System.err.println("trying to acquire the mutex");
			boolean tryLock = mutex.tryLock();
			if (!tryLock) {
				System.err.println("failed to lock, exiting!");
				return;
			}
			try {
				System.err.println("I got it!");
			} finally {
				mutex.unlock();
				System.err.println("releasing mutex");
			}
			System.err.println("finishing");
		});

		mutex.lock();
		try {
			t.start();
			Time.pause(3000);
			System.out.println("interrupting thread");
			t.interrupt();
			Time.pause(3000);
			System.out.println("killing thread");
			t.stop();
			while (true) {
				Time.pause(1000);
			}
		} finally {
			mutex.unlock();
		}

	}

}
