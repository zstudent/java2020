package lesson210104;

import java.util.function.Predicate;

public class AnotherPredicateExample {
	
	public static void main(String[] args) {
		
		Predicate<String> ac = s -> s.contains("ac");
		Predicate<String> gt = s -> s.contains("gt");
		
		Predicate<String> acgt = s -> s.contains("ac") && s.contains("gt");
		Predicate<String> acgt2 = ac.and(gt);
		
		boolean test = acgt2.test("agctgactcggtagacgacgtc");
		System.out.println(test);
		
	}

}
