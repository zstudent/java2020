package lesson210225;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class LiveLockExample {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		ReentrantLock lock = new ReentrantLock();
		
		lock.lock();
		
		Runnable task = () -> {
			try {
				boolean success = false;
				while (!success) {
					success = lock.tryLock(1, TimeUnit.SECONDS);
					System.err.println(Thread.currentThread().getName() + " " + success);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		
		while (true) {
			Time.pause(2000);
			System.out.println(lock.isHeldByCurrentThread());
			System.out.println(lock.getQueueLength());
		}
		
	}

}
