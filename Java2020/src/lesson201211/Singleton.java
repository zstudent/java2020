package lesson201211;

public class Singleton {
	
	final private static Singleton instance = new Singleton();

	private Singleton() {
	}
	
	static public Singleton instance() {
		return instance;
	}
	
}
