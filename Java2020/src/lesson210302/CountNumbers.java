package lesson210302;

import java.util.concurrent.*;

public class CountNumbers extends RecursiveAction {
	private int start;
	private int end;

	public CountNumbers(int start, int end) {
		this.start = start;
		this.end = end;
	}

	protected void compute() {
		if (start < 0)
			return;
		else {
			int middle = start + ((end - start) / 2);
			invokeAll(new CountNumbers(start, middle), new CountNumbers(middle, end)); // m1
		}
	}

	public static void main(String[] args) {
		 // m2
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(new CountNumbers(0, 4)); // m3
	}
}