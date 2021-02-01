package lesson210201;

import utils.Time;

public class TheadExamples3 {
	
	static int x = 10;
	
	public static void main(String[] args) {
		System.out.println("Main started");
		
		new Thread(() -> {
			System.out.println("Thread started");
			Time.pause(3000);
			System.out.println("hello, x = " + x);  // x is NOT captured, it's a field!
		}).start();
		
		x = 20;
		System.out.println("Main finished");
		
	}

}
