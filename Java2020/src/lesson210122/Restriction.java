package lesson210122;

import java.util.ArrayDeque;

public class Restriction {
	
	public static void main(String[] args) {
		
		new MyStack().addLast("hello");
		
	}

}


class MyStack extends ArrayDeque<String> {

	@Override
	public void addLast(String e) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String removeLast() {
		throw new UnsupportedOperationException();
	}
	
	
}
