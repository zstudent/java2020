package lesson210429;

public class NotSoGoodSingleton {
	
	private NotSoGoodSingleton() {
		
	}
	
	private static NotSoGoodSingleton instance;
	
	synchronized public static NotSoGoodSingleton instance() {
		if (instance == null) {
			instance = new NotSoGoodSingleton(); // lazy instantiation
		}
		return instance;
	}

}
