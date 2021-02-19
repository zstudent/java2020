package lesson210219;

import java.util.concurrent.Semaphore;

import utils.Time;

public class SemaphoreExamples1 {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		Semaphore sem = new Semaphore(0);
		
		new Thread(() -> {
			System.err.println("waiting for a signal to start..");
			sem.acquireUninterruptibly();
			System.err.println("got persmission to start!");
			// do something here
		}).start();
		
		Time.pause(3000);
		
		sem.release();
	}

}
