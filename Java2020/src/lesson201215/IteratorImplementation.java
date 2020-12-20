package lesson201215;

import java.util.Iterator;

final class IteratorImplementation implements Iterator<String> {

	final private MyList list;

	Node pointer;

	IteratorImplementation(MyList myList) {
		this.list = myList;
		pointer = list.first;
	}

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
}