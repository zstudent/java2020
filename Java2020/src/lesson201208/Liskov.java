package lesson201208;

import java.util.ArrayDeque;

public class Liskov {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		ArrayDeque<String> d = new ArrayDeque<String>();
		
		process(d);
		process(stack);
		
		
	}

	private static void process(ArrayDeque<String> d) {
		d.addLast("hello");
	}
	

}
