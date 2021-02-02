package lesson210202;

import utils.Time;

public class ThreadStackExample {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		int z = calc(x);
		
	}

	private static int calc(int x) {
		Time.pause(100_000);
		return x * 2;
	}

}
