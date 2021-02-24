package lesson210223;

import java.util.concurrent.CountDownLatch;

import utils.Time;

public class CountdownLatchExamples1 {
	
	public static void main(String[] args) {
		
		System.out.println("start main");
		
		CountDownLatch latch = new CountDownLatch(2);
		
		Runnable task = () -> {
			try {
				System.err.println(Thread.currentThread().getName() + " starting to await...");
				latch.await();
				System.err.println(Thread.currentThread().getName() + " got it!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		
		Time.pause(3000);
		System.out.println("first");
		latch.countDown();

		Time.pause(3000);
		System.out.println("second");
		latch.countDown();
		
	}

}
