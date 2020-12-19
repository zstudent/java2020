package lesson201214.interfaces;

import java.util.Iterator;

public class UseMyList {
	
	public static void main(final String[] args) {
		
		System.out.println("start");
		final MyList list = new MyList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.print();
		
		for (String value :list) {
			System.out.println(value);
		}
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
