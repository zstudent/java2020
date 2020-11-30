package lesson201130;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> mutable = new ArrayList<Integer>() {{
				add(100);
				add(20);
				add(30);
		}};
		
		System.out.println(mutable);
		
		List<Integer> immutable = Arrays.asList(10, 20, 30);
		System.out.println(immutable);
		
		mutable.add(40);
		System.out.println(mutable);
		
//		ints.add(40);    ERROR!   ints is immutable, can't add!
//		System.out.println(ints);

		immutable.set(0, 40);
		System.out.println(immutable);
		
		System.out.println(mutable.size());
		System.out.println(mutable.contains(30));
		
		Collections.sort(mutable);
		System.out.println(mutable);

		mutable.clear();
		System.out.println(mutable);
	}

}
