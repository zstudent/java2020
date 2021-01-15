package lesson210115;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		List<Integer> squares = list.stream().map(i -> i * i).collect(Collectors.toList());
		
		List<Integer> list2 = Arrays.asList(6,7,8);
		
		List<int[]> collect = list
				.stream()
				.flatMap(i -> list2.stream().map(j -> new int[] {i,j}))
				.collect(Collectors.toList());
		
		collect.forEach(a -> System.out.println(Arrays.toString(a)));
	}

}
