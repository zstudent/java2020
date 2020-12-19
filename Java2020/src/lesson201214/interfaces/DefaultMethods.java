package lesson201214.interfaces;

public interface DefaultMethods {
	
	int process(int y);
	
	static int calculate(final int x, final int y) {
		return x + y;
	}
	
	default int calculate(final int x) {
		return x * 2;
	}

}
