package lesson201216;

public class Stack {
	
	int[] data;
	int tos = 0;
	
	public Stack(int capacity) {
		data = new int[capacity];
	}
	
	public int size() {
		return tos;
	}
	
	public boolean isEmpty() {
		return tos <= 0;
	}
	
	public void push(int value) throws Exception {
		if (tos >= data.length) {
			throw new Exception("Stack Overflow");
		}
		data[tos++] = value;
	}
	
	public int pop() throws Exception {
		if (tos <= 0) {
			throw new Exception("Stack Underflow");
		}
		return data[--tos];
	}

}
