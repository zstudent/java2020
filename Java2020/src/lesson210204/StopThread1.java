package lesson210204;

import utils.Time;

public class StopThread1 {
	
	volatile static boolean flag = true;

	public static void main(String[] args) {
		
		new Thread().start();
		new Thread(() -> {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
		}).start();
		
		
		new Thread(() -> {
			while (flag) {}
		}).start();
		
		Time.pause(3000);
		
		flag = false;
	}

}
