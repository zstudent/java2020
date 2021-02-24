package lesson210201;

import utils.Time;

public class TheadExamples4 {
	
	private static final class Task implements Runnable {
		
		private int x;

		public Task(int x) {
			this.x = x;
		}
		
		@Override
		public void run() {
			System.out.println("Thread started");
			Time.pause(3000);
			System.out.println("hello, x = " + x);  // x is NOT captured, it's a field!
		}
	}

	
	public static void main(String[] args) {
		System.out.println("Main started");
		
		int x = 10;
		
		new Thread(new Task(x)).start();
		
		x = 20;
		System.out.println("Main finished");
		
	}

}
