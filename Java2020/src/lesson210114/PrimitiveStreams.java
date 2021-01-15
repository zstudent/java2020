package lesson210114;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class PrimitiveStreams {
	
	public static void main(String[] args) {
		
		IntStream.rangeClosed(0, 9).forEach(System.out::println);
		int sum = IntStream.rangeClosed(0, 9).sum();
		IntSummaryStatistics summaryStatistics = IntStream.rangeClosed(0, 9).summaryStatistics();
		
		System.out.println(summaryStatistics);
		
	}

}
