package lesson201130;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		System.out.println(list.toString());
		
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list.toString());
		
		list.add(0, "zero");
		System.out.println(list);

//		list.add(10, "eleven");   ERROR!  Out of Bounds
//		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
//		list.remove(10);   ERROr:  out of bounds
//		System.out.println(list);
		
		list.remove("zero");
		System.out.println(list);
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		ints.add(0);
		ints.add(10);
		ints.add(2);
		
//		ints.remove(10);  ERROR!  out of bounds
//		System.out.println(ints);

		ints.remove((Integer)10); // use cast!
		System.out.println(ints);

		list.set(0, "two");
		System.out.println(list);
		
		
	}

}
