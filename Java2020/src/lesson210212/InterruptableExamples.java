package lesson210212;

import utils.Time;

public class InterruptableExamples {
	
	public static void main(String[] args) {

		System.out.println("start");
		
		Object mutex = new Object();
		
		Thread t = new Thread(() -> {
			System.err.println("trying to acquire the mutex");
			synchronized (mutex) {
				System.out.println("I got it!");
			}
		});
		
		synchronized (mutex) {
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
		}
		
	}

}
