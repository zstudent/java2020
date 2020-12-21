package lesson201221;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorExamples1 {
	
	public static void main(String[] args) {
		
		List<CharSequence> list = new LinkedList<>();
		
		list.add("Hello");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append('c').append(10).append(true);
		
		list.add(sb);
		
		list.add("Another string");
		
		for (CharSequence something : list) {
			System.out.println(something);
		}
		
		System.out.println("----");
		
//		Collections.sort(list); ERROR: needs comparable!
		
		Comparator<CharSequence> comparator = new Comparator<CharSequence>() {

			@Override
			public int compare(CharSequence o1, CharSequence o2) {
				return o1.toString().compareTo(o2.toString());
			}
		};
		
		
		Collections.sort(list, comparator);
		
		System.out.println(list);
		
	}

}
