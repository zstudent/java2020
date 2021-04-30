package lesson210429;

public class GoodSingleton {
	
	private GoodSingleton() {
		System.out.println("constructor");
	}
	
	private static GoodSingleton instance = new GoodSingleton();
	
	public static GoodSingleton instance() {
		return instance;
	}

}
