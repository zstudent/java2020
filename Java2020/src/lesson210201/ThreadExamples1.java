package lesson210201;

import utils.Time;

public class ThreadExamples1 {
	
	private static final class ThreadExtension extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.println(Thread.currentThread());
				Time.pause(1000);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new ThreadExtension();
		
		thread.start();
		
		while (true) {
			System.err.println(Thread.currentThread());
			Time.pause(1000);
		}
		
	}

}
