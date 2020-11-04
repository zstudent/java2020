package lesson201104;

import java.util.HashMap;
import java.util.Map;

public class Wrappers {
	
	public static void main(String[] args) {
		
		int x = 0;
		
		Integer y = x;  // = new Integer(x),  autoboxing
		
		int[] years = {1963, 1993, 1999, 1999, 1997, 1996, 1996, 1996, 1981, 1996 };
		
		Map<Integer, Integer> count = new HashMap<>();
		
		int hash = years.hashCode();
		
		System.out.println(hash);
		System.out.println(y.hashCode());
		System.out.println(count.hashCode());
		System.out.println(args.hashCode());
		System.out.println("Hello".hashCode());
		
		for (int year : years) {
			count.compute(year, (k, v) -> (v == null) ? 1 : v + 1);
//			count.put(year, count.getOrDefault(year, 0) + 1);

			//			Integer val = count.getOrDefault(year, 0);
//			int sum = val.intValue() + 1; // unboxing
//			Integer newValue = new Integer(sum); // boxing
//			count.put(year, newValue);
//			count.put(year, val + 1);
		}
		
		System.out.println(count);
		
		
	}

}


