package lesson210301;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;

public class ParallelStrreamsExamples3 {

	public static void main(String[] args) {

//		List<Integer> data = Collections.synchronizedList(new ArrayList<>());
//		List<Integer> data = new ArrayList<>();
//		Collection<Integer> data = new ArrayBlockingQueue<>(10);
//		Collection<Integer> data = new ConcurrentSkipListSet<>();
		Collection<Integer> data = new LinkedBlockingQueue<>();
		Arrays.asList(1, 2, 3, 4, 5, 6)
			.parallelStream().map(i -> {
					data.add(i*2);
					return i;
				})
			.forEachOrdered(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println(data);
	}

}
