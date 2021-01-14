package lesson210114;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExamples4 {
	
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Stream<Double> stream = Stream.generate(Math::random);
		
		System.out.println("after generate");
		
		Stream<Integer> stream2 = stream
				.limit(1000)
				.peek(System.out::println)
				.filter(d -> d < 0.5)
				.map(d ->  (int)(d* 1000))
				.peek(System.out::println)
				.sorted()
				.distinct()
				.skip(10);
		
		System.out.println("after limit");
		
		List<Integer> numbers = stream2.collect(Collectors.toList());
		
		System.out.println(numbers);
	}

}
