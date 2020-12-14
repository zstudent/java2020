package lesson201214.interfaces;

import java.util.Iterator;

public class MyList implements Iterable<String> {

	static class Node {
		String value;
		Node next;
		public Node(final String value, final Node next) {
			this.value = value;
			this.next = next;
		}
	}

	Node last;
	Node first;

	public void add(final String value) {
		final Node node = new Node(value, null);
		if (null == last) {
			last = first = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public void print() {
		Node n = first; // or head
		while (null != n) {
			System.out.println(n.value);
			n = n.next;
		}
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String> () {

			Node pointer = MyList.this.first;
			
			@Override
			public boolean hasNext() {
				return pointer != null;
			}

			@Override
			public String next() {
				String value = pointer.value;
				pointer = pointer.next;
				return value;
			}
			
		};
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
