package lesson210219;

import java.util.concurrent.Semaphore;

import utils.Time;

public class SemaphoreExamples3 {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		Semaphore sem = new Semaphore(-2);
		
		new Thread(() -> {
			System.err.println("waiting for a signal to start..");
			sem.acquireUninterruptibly();
			System.err.println("got persmission to start!");
			// do something here
			System.err.println(sem.availablePermits());
		}).start();
		
		System.out.println(sem.availablePermits());
		Time.pause(1000);
		System.out.println("one...");
		sem.release();
		System.out.println(sem.availablePermits());
		Time.pause(1000);
		System.out.println("two...");
		sem.release();
		System.out.println(sem.availablePermits());
		Time.pause(1000);
		System.out.println("three...");
		sem.release();
		System.out.println(sem.availablePermits());
		
	}

}
