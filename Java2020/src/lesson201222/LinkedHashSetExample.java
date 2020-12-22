package lesson201222;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<Integer>(4);
		
		System.out.println(set.add(10));  // 10
		set.add(5);  // 5
		System.out.println(set.add(10));
		System.out.println(set.add(10));
		set.add(20);  // 20
		set.add(20);
		set.add(5);
		System.out.println(set.add(10));
		set.add(5);
		set.add(5);
		set.add(15); // 15
		set.add(15);
		set.add(5);
		set.add(15);
		set.add(15);
		
		System.out.println(set);

		System.out.println(set.contains(15));
		System.out.println(set.contains(12));
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
	}

}
