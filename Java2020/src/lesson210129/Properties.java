package lesson210129;

public class Properties {

	private static final Properties p = new Properties();

	private Properties() {
	}

	public static Properties get() {
		return p;
	}
	
	String serverURL() { return "";}
}
