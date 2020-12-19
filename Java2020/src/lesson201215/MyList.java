package lesson201215;

import java.util.Iterator;

public class MyList implements Iterable<String> {

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
		return new IteratorImplementation(this);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
