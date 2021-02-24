package lesson210114;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExamples1 {
	
	public static void main(String[] args) {
		
		Stream<String> empty = Stream.empty();
		Stream<Integer> number = Stream.of(1);
		Stream<Integer> ints = Stream.of(1,2,3);
		
		List<String> list = Arrays.asList("one", "two", "three");
		Stream<String> streamOfStrings = list.stream();
		
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream.iterate(1, n -> n + 1);
		
		randoms.limit(10).forEach(System.out::println);
		
		Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
		
		long count = streamOfStrings.count();
		System.out.println(count);
		
		Optional<Double> max = Stream.generate(Math::random).limit(100).max((d1, d2) -> (int)(d1 * 1000) - (int)(d2 * 1000));

		max.ifPresent(System.out::println);
		
		boolean allStringAreLongEnough = list.stream().allMatch(s -> s.length() > 2);
		
		System.out.println(allStringAreLongEnough);
		
		Optional<String> first = list.stream().findFirst();
		first.ifPresent(System.out::println);
		
	}

}
