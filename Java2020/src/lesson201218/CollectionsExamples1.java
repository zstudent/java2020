package lesson201218;

import java.util.LinkedList;
import java.util.List;

public class CollectionsExamples1 {
	
	public static void main(String[] args) {
		
		List<CharSequence> list = new LinkedList<>();
		
		list.add("Hello");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append('c').append(10).append(true);
		
		list.add(sb);
		
		for (CharSequence something : list) {
			System.out.println(something);
		}
		
//		Collections.sort(list); ERROR: needs comparable!
		
	}

}
