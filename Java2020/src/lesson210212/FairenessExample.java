package lesson210212;

import utils.Time;

public class FairenessExample {
	
	public static void main(String[] args) {
		
		Object m = new Object();
		
		Runnable r = () -> {
			String name = Thread.currentThread().getName();
			System.out.println("beginning: " + name);
			synchronized (m) {
				System.out.println("synched: " + name);
				Time.pause(1000);
			}
		};

		synchronized (m) {
			new Thread(r).start();
			Time.pause(1000);
			new Thread(r).start();
			Time.pause(1000);
			new Thread(r).start();
			Time.pause(1000);
			new Thread(r).start();
			Time.pause(1000);
		}
		
	}

}
