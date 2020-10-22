package utils;

public class Time {
	
	static public void pause(int millis) { // global function
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
