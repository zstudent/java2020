package lesson210204;

import utils.Time;

public class StopThread3 {

	static long i = 0;
	
	public static void main(String[] args) {

		System.out.println("start");
		
		Thread t = new Thread(() -> {
			while (true) {i++;}
		});
		t.start();
		
		Time.pause(3000);
		
		t.stop();
		
		System.out.println(i);
		
	}

}
