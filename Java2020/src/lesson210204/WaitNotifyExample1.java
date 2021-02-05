package lesson210204;

import utils.Time;

public class WaitNotifyExample1 {

	private static final class Task implements Runnable {
		private final Object mutex;

		private Task(Object mutex) {
			this.mutex = mutex;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " waiting for a signal...");
			synchronized (mutex) {
				try {
					mutex.wait();
					System.out.println(Thread.currentThread().getName() + " signal received!");
				} catch (InterruptedException e) {
					System.out.println("interrupted!");
				}
			}
			Time.pause(3000);
			System.out.println(Thread.currentThread().getName() + " finished!");
		}
	}

	public static void main(String[] args) {

		Object mutex = new Object();
		
		new Thread(new Task(mutex)).start();
		new Thread(new Task(mutex)).start();
		new Thread(new Task(mutex)).start();
		
		Time.pause(3000);
		
		synchronized (mutex) {
			mutex.notifyAll();
			System.out.println("Notified...");
			Time.pause(3000);
		}

	}

}
