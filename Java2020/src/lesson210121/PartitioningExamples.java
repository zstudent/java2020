package lesson210121;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningExamples {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map = stream.collect(Collectors.partitioningBy(s -> s.length() <= 5));
		System.out.println(map);

	}

}
