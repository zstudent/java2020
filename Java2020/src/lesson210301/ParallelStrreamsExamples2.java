package lesson210301;

import java.util.Arrays;

public class ParallelStrreamsExamples2 {
	
	public static void main(String[] args) {
		
		Arrays.asList("jackal", "kangaroo", "lemur")
		.parallelStream()
		.map(String::toUpperCase)
		.forEachOrdered(System.out::println);

		System.out.println();
		System.out.println();
		
		Arrays.asList("jackal", "kangaroo", "lemur")
			.parallelStream()
			.map(s -> {System.out.println(s); return s.toUpperCase();})
			.forEach(System.out::println);
		
		System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().findAny().get());
	}

}
