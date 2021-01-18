package lesson210105;

import java.util.function.Supplier;

public class ClientCode {
	
	public static void main(String[] args) {
		
		process(() -> "hello");
		
	}

	private static void process(Supplier<String> s) {
		// TODO Auto-generated method stub
	}

}
