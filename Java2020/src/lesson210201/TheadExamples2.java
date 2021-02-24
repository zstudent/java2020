package lesson210201;

import utils.Time;

public class TheadExamples2 {
	
	public static void main(String[] args) {
		System.out.println("Main started");
		
		final int x = 10;
		
		new Thread(() -> {
			System.out.println("Thread started");
			Time.pause(3000);
			System.out.println("hello, x = " + x);  // x is captured
		}).start();
		
//		x = 20;
		System.out.println("Main finished");
		
	}

}
