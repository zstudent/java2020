package lesson210301;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParalleStreamsExamples1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Stream<Integer> parallel1 = list.stream().parallel();
		Stream<Integer> parallel2 = list.parallelStream();
		
		list.stream().forEach(System.out::print);
		System.out.println();
		list.parallelStream().forEach(System.out::print);
		System.out.println();
		list.parallelStream().forEachOrdered(System.out::print);
	}

}
