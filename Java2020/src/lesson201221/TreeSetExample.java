package lesson201221;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>();
		
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
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
	}

}
