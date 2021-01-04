package lesson210104;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(8);

		System.out.println(list);

		list.removeIf(i -> i % 2 == 0);

		System.out.println(list);

//		Predicate<Integer> p = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return t % 3 == 0;
//			}
//		};
//		
//		list.removeIf(p);
//		
//		System.out.println(list);
//		
//		list.removeIf(new BigSomething());
//		System.out.println(list);
	}

}

class BigSomething implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return true;
	}

}