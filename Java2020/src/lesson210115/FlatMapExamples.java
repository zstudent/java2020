package lesson210115;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExamples {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString("Hello".split("")));
		
		List<String> list = Arrays.asList("Hello", "World");
		
		List<String[]> collect = list.stream()
			.map(w -> w.split(""))
			.distinct()
			.collect(Collectors.toList());

		List<Stream<String>> collect2 = list.stream()
				.map(w -> w.split(""))  // String -> String[]
				.map(t -> Arrays.stream(t))  // String[] -> Stream<String>
				.distinct()
				.collect(Collectors.toList());

		List<String> collect3 = list.stream()
				.map(w -> w.split(""))  // String -> String[]
				.flatMap(t -> Arrays.stream(t))  // String[] -> String, String, String
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(collect3);
	}

}
