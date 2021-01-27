package lesson210121;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingExamples1 {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("lions", "tigers", "bears");
		String result = stream.collect(Collectors.joining(", "));
		System.out.println(result);
		
		Stream<String> stream2 = Stream.of("lions", "tigers", "bears");
		Double avgLength = stream2.collect(Collectors.averagingInt(String::length));
		System.out.println(avgLength);
		
		Stream<String> stream3 = Stream.of("lions", "tigers", "bears");
		List<String> list = stream3.collect(Collectors.toList());
		System.out.println(list);

		Stream<String> stream4 = Stream.of("lions", "tigers", "bears");
		TreeSet<String> set = stream4.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set);

		Stream<String> stream5 = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map = stream5.collect(Collectors.toMap(s -> s, String::length));
		System.out.println(map);

//		Stream<String> stream6 = Stream.of("lions", "tigers", "bears");
//		Map<Integer, Object> map6 = stream6.collect(Collectors.toMap(String::length, s -> s)); // BAD!
//		System.out.println(map6);

		Stream<String> stream6 = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> map6 = stream6
				.collect(Collectors.toMap(String::length, Function.identity(), (s1, s2) -> s1 +"," + s2));
		System.out.println(map6);

		Stream<String> stream7 = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> map7 = stream7
				.collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 +"," + s2, TreeMap::new));
		System.out.println(map7);
	}

}
