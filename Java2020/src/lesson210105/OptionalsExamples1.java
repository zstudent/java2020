package lesson210105;

import java.util.Optional;

public class OptionalsExamples1 {
	
	public static void main(String[] args) {
		
		int[] data = {10, 0, 12, 45};
		
//		System.out.println(average(data));

//		System.out.println(average(null));
//		
//		System.out.println(average(new int[] {}));
		
		System.out.println(avg(data));

		System.out.println(avg(null));
		
		System.out.println(avg(new int[] {}));
		
		Optional<Integer> maybeAvg = avg(data);
		if (maybeAvg.isPresent()) {
			System.out.println(maybeAvg.get());
		}
		
//		maybeAvg = avg(null);
//		System.out.println(maybeAvg.get());
		
//		Optional.of(null);		
		
		Optional.ofNullable(null);
		
		maybeAvg.ifPresent(System.out::println);
		maybeAvg.ifPresent(OptionalsExamples1::process);
		
		System.out.println(maybeAvg.orElse(0));
		System.out.println(avg(null).orElse(0));
		System.out.println(avg(null).orElseGet(() -> 0));
		System.out.println(avg(null).orElse(defaultAvgValue()));
		System.out.println(avg(null).orElseGet(OptionalsExamples1::defaultAvgValue));
	}
	
	
	static void process(int value) {
		System.out.println(value);
	}
	
	static int defaultAvgValue() {
		return 0;
	}

	private static int average(int[] data) throws IllegalArgumentException {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException();
		}
		int sum = 0;
		for (int i : data) {
			sum += i;
		}
		return sum/data.length;
	}
	
	static Optional<Integer> avg(int[] data) {  // Maybe
		if (data == null || data.length == 0) {
			return Optional.empty();
		}
		int sum = 0;
		for (int i : data) {
			sum += i;
		}
		return Optional.of(sum/data.length);
		
	}

}
