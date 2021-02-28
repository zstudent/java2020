package lesson210225;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Question7addition {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,3); 
//		List<Integer> l2 = new ArrayList<>(l1);
		List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
		for(Integer item: l2) l2.add(4); 

		System.out.println(l2);
	}

}
