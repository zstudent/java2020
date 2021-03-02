package lesson210302;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinExamples1 {
	
	private static final int SIZE = 1_000_000_000;

	static public int factorial(int n) {
		if (n <= 1) return 1;
		else return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		int[] z = new int[SIZE];
		measureFill(z);
		measureSum(z);
	}

	private static void measureFill(int[] z) {
		long start = System.currentTimeMillis();
//		fill(z);
		fillWithForkJoin(z);
		long stop = System.currentTimeMillis();
		System.out.println("elasped " + (stop - start));
	}
	
	private static void measureSum(int[] z) {
		long start = System.currentTimeMillis();
//		fill(z);
		sumWithForkJoin(z);
		long stop = System.currentTimeMillis();
		System.out.println("elasped " + (stop - start));
	}
	
	private static void sumWithForkJoin(int[] z) {
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(new FillAction(z, 0, z.length-1));
	}

	private static void fill(int[] a) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt();
		}
	}

	private static void fillWithForkJoin(int[] a) {
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(new FillAction(a, 0, a.length-1));
	}
	
}



