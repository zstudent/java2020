package lesson201218;

public class Stack<E> {
	
	E[] data;
	int tos = 0;
	
	@SuppressWarnings("unchecked")
	public Stack(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	public int size() {
		return tos;
	}
	
	public boolean isEmpty() {
		return tos <= 0;
	}
	
	public void push(E value) throws Exception {
		if (tos >= data.length) {
			throw new Exception("Stack Overflow");
		}
		data[tos++] = value;
	}
	
	public E pop() throws Exception {
		if (tos <= 0) {
			throw new Exception("Stack Underflow");
		}
		return data[--tos];
	}

}
