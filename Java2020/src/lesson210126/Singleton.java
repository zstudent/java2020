package lesson210126;

public class Singleton {
	
	private static final Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("constructor");
	}
	
	public static Singleton instance() {
		return instance;
	}

}
