package lesson210216;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class ReentrancyWithLock3 {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		lock.lock();
		lock.lock();
		
		Runnable r = () -> {
			System.out.println("started");
			lock.lock();
			try {
				System.out.println("I've got it!");
			} finally {
				lock.unlock();
			}
		};
		
		System.out.println("starting a thread");
		new Thread(r).start();
		
		Time.pause(1000);
		
		System.out.println(lock.getHoldCount());
		System.out.println(lock.getQueueLength());
		
		System.out.println("unlocking");
		lock.unlock();
		lock.unlock();
		lock.unlock();
		
		
		
	}

}

