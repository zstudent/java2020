package lesson201103;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachExample {
	
	public static void main(String[] args) {
		
		for (String arg : args) {
			System.out.println(arg);
		}

		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			System.out.println(arg);
		}
		
		List<String> list = Arrays.asList("one", "two", "three");
		
		for (String word : list) {
			System.out.println(word);
		}
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String word = it.next();
			System.out.println(word);
		}
		
		for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
			String word = itr.next();
			System.out.println(word);
		}
		
	}

}
