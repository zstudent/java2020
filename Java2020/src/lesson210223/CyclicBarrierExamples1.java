package lesson210223;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import utils.Time;

public class CyclicBarrierExamples1 {
	
	private static final class Task implements Runnable {
		private final CyclicBarrier barrier;

		private Task(CyclicBarrier barrier) {
			this.barrier = barrier;
		}

		@Override
		public void run() {
			try {
				int time = 1000 + (int)(Math.random() * 5000);
				System.err.println(Thread.currentThread().getName() + " start..");
				Time.pause(time);
				System.err.println(Thread.currentThread().getName() + " await..");
				barrier.await(2, TimeUnit.SECONDS);
				System.err.println(Thread.currentThread().getName() + " working");
				Time.pause(time);
				System.err.println(Thread.currentThread().getName() + " done");
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("start");
		
		CyclicBarrier barrier = new CyclicBarrier(3, () -> {
			System.out.println("all done!");
		});
		
		
		new Thread(new Task(barrier)).start();
		new Thread(new Task(barrier)).start();
		new Thread(new Task(barrier)).start();
		
	}

}
