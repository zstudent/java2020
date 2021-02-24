package lesson210121;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ExamExamples {
	
	public static void main(String[] args) {
		
		
//		List<Integer> l1 = Arrays.asList(1, 2, 3); 
//		List<Integer> l2 = Arrays.asList(4, 5, 6); 
//		List<Integer> l3 = Arrays.asList(); 
//		Stream.of(l1, l2, l3)
//			.flatMap(x -> x.stream())
//			.map(x -> x + 1)
//			.forEach(System.out::print);
//		
//		
//		Stream<Integer> s = Stream.of(1);
//		s.mapToInt(x->x);
//		DoubleStream ds = s.mapToDouble(x->x);
//		IntStream s2 = ds.mapToInt(x -> (int)x);
		
		
//		Stream<String> s = Stream.empty(); 
//		Stream<String> s2 = Stream.empty(); 
//		Map<Boolean, List<String>> p = s.collect(
//				Collectors.partitioningBy(b -> b.startsWith("c")));
//		Map<Boolean, List<String>> g = s2.collect(
//				Collectors.groupingBy(b -> b.startsWith("c")));
//		System.out.println(p + " " + g);
		
		DoubleStream s = DoubleStream.of(1.2, 2.4);
		s.peek(System.out::println).filter(x -> x > 2).count();
		
		List<Integer> l = IntStream.range(1, 6) .mapToObj(i -> i).collect(Collectors.toList());
		l.forEach(System.out::println);
		
		IntStream.range(1, 6)
		.mapToObj(i -> i)
		.forEach(System.out::println);
	}

}
