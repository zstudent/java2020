package lesson201208;

import java.util.ArrayDeque;

public class MyStack extends ArrayDeque<String> {

	@Override
	public void addLast(String e) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String removeLast() {
		throw new UnsupportedOperationException();
	}
	
	
}
