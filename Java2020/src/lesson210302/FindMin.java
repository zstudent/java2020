package lesson210302;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FindMin extends RecursiveTask<Integer> {
	private Integer[] elements;
	private int a;
	private int b;

	public FindMin(Integer[] elements, int a, int b) {
		this.elements = elements;
		this.a = a;
		this.b = b;
	}

	public Integer compute() {
		if ((b - a) < 2)
			return Math.min(elements[a], elements[b]);
		else {
			int m = a + ((b - a) / 2);
			System.out.println(a + "," + m + "," + b);
			FindMin t1 = new FindMin(elements, a, m);
			FindMin t2 = new FindMin(elements, m, b);
			t1.fork();
			Integer result2 = t2.compute();
			Integer result1 = t1.join();
			return Math.min(result1, result2);
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Integer[] elements = new Integer[] { 8, -3, 2, -54 };
		FindMin task = new FindMin(elements, 0, elements.length - 1);
		ForkJoinPool pool = new ForkJoinPool(1);
		Integer sum = pool.invoke(task);
		System.out.println("Min: " + sum);
	}
}