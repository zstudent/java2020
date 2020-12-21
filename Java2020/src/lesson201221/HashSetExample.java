package lesson201221;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println(set.add(10));
		set.add(5);
		System.out.println(set.add(10));
		System.out.println(set.add(10));
		set.add(20);
		set.add(20);
		set.add(5);
		System.out.println(set.add(10));
		set.add(5);
		set.add(5);
		set.add(15);
		set.add(15);
		set.add(5);
		set.add(15);
		set.add(15);
		
		System.out.println(set);

		System.out.println(set.contains(15));
		System.out.println(set.contains(12));
		
	}

}
