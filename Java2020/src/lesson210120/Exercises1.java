package lesson210120;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises1 {
	
	public static void main(String[] args) {
		
//		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
//		System.out.println(stream.limit(2).map(x -> x + "2"));

//		Predicate<? super String> predicate = s -> s.startsWith("g"); 
//		Stream<String> stream1 = Stream.generate(() -> "growl! "); 
//		Stream<String> stream2 = Stream.generate(() -> "growl! "); 
//		boolean b1 = stream1.anyMatch(predicate);
//		System.out.println(b1);
//		boolean b2 = stream2.allMatch(predicate); 
//		System.out.println(b1 + " " + b2);
		
//		Predicate<? super String> predicate = s -> s.length() > 3; 
//		Stream<String> stream = Stream.iterate("-", (s) -> s + s); 
//		boolean b1 = stream.peek(System.out::println).noneMatch(predicate);
//		System.out.println(b1);
//		boolean b2 = stream.anyMatch(predicate); 
//		System.out.println(b1 + " " + b2);

//		Stream<String> s = Stream.generate(() -> "meow"); 
//		boolean match = s.peek(System.out::println).noneMatch(String::isEmpty); 
//		System.out.println(match);

//		String string = Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining());
//		System.out.println(string);
		
	}

}
