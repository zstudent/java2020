package lesson210121;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingExamples {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("lions", "tigers", "bears");
		Map<Integer, List<String>> result = stream.collect(Collectors.groupingBy(String::length));
		System.out.println(result);
		
		Stream<String> s2 = Stream.of("lions", "tigers", "bears");
		Map<Integer, Set<String>> r2 = s2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(r2);
		
		Stream<String> s3 = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, Set<String>> r3 = s3
				.collect(Collectors.groupingBy(String::length, TreeMap::new ,Collectors.toSet()));
		System.out.println(r3);
		
		
	}

}
