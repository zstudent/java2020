package lesson210114;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExamples2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Integer result = Stream.of(10, 20, 30).reduce(0, (a, b) -> a + b);
		
		System.out.println(result);
		
		
		Integer sum = sum(list);
		
		Optional<Integer> optional = list.stream().reduce((a,b) -> a*b);
		optional.ifPresent(System.out::println);
		
	}

	private static Integer sum(List<Integer> list) {
		Integer sum = 0;
		for (Integer element : list) {
			sum += element;
		}
		return sum;
	}

}
