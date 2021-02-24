package lesson210216;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Time;

public class UnlockingExamples {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Lock lock = new ReentrantLock();
		
		lock.lock();
		
		new Thread(() -> {
			lock.unlock();
		}).start();
		
		Time.pause(1000);
	}

}
