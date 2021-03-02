package lesson210302;

import java.util.Random;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {
	
	private static final int THRESHOLD = 1000;
	private int[] a;
	private int lo;
	private int hi;

	public SumTask(int[] a, int lo, int hi) {
		this.a = a;
		this.lo = lo;
		this.hi = hi;
	}

	@Override
	protected Integer compute() {
		if (hi - lo <= THRESHOLD) {
			int sum = 0;
			for (int i = lo; i <= hi; i++) {
				sum += a[i];
			}
			return sum;
		} else {
			int m = lo + (hi - lo) / 2;
			SumTask task1 = new SumTask(a, lo, m);
			SumTask task2 = new SumTask(a, m+1, hi);
			task1.fork();
			Integer sum2 = task2.compute();
			Integer sum1 = task1.join();
			return sum1 + sum2;
		}
	}

}
