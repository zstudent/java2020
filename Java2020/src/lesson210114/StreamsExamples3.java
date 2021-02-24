package lesson210114;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExamples3 {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("one","two","three");
		
//		String result = stream.reduce("", String::concat);
		
//		System.out.println(result);
		
//		TreeSet<String> collect = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		
//		Set<String> collect = stream.collect(Collectors.toSet());
		Set<String> collect = stream.collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println(collect);
		
		
		List<Double> randoms = Stream.generate(Math::random).limit(100).collect(Collectors.toList());
		System.out.println(randoms);
		
	}

}
