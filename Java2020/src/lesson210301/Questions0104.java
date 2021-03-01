package lesson210301;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Questions0104 {
	
	public static void main(String[] args) {
		
		AtomicLong value1 = new AtomicLong(0); 
		IntStream.iterate(1, i -> 1)
			.limit(100)
			.parallel() 
			.forEach(i -> value1.incrementAndGet());
		System.out.println(value1);
		
		final long[] value2 = {0};
		IntStream.iterate(1, i -> 1)
			.limit(100)
			.parallel() 
			.forEach(i -> {
//				synchronized (value2) {
					++value2[0];
//				}
			});
		System.out.println(value2[0]);
		
	}

}
