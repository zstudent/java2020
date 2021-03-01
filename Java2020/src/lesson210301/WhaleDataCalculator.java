package lesson210301;

import java.util.ArrayList;
import java.util.List;

import utils.Time;

public class WhaleDataCalculator {
	public int processRecord(int input) {
		Time.pause(1);
		return input + 1;
	}

	public void processAllData(List<Integer> data) {
		data.stream().parallel().map(a -> processRecord(a)).mapToInt(i -> i).sum();
//		data.stream().map(a -> processRecord(a)).count();
	}

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		WhaleDataCalculator calculator = new WhaleDataCalculator();
		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < 4000; i++)
			data.add(i);
		long start = System.currentTimeMillis();
		calculator.processAllData(data);
		double elapsed = (System.currentTimeMillis() - start) / 1000.0;
		System.out.println("\nTasks completed in: " + elapsed + " seconds");
	}
}