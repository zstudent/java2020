package lesson210204;

import utils.Time;

public class StopThread4 {

	static long i = 0;
	
	public static void main(String[] args) {

		System.out.println("start");
		
		Z z = new Z();
		
		Thread t = new Thread(() -> {
			while (true) {z.change();}
		});
		t.start();
		
		Time.pause(3000);
		
		t.stop();
		
		System.out.println(z.consistent());
		
	}

}

class Z {
	int x, y;
	
	void change() {
		x++; y--;
	}
	
	boolean consistent() {
		return x + y == 0;
	}
}