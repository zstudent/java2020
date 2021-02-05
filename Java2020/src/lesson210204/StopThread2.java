package lesson210204;

import utils.Time;

public class StopThread2 {
	
	public static void main(String[] args) {
		
		new Thread().start();
		new Thread(() -> {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
		}).start();
		
		
		Thread t = new Thread(() -> {
			long i = 0;
			while (!Thread.interrupted()) {i++;}
			System.out.println(i);
		});
		t.start();
		
		Time.pause(3000);
		
		t.interrupt();
		
	}

}
