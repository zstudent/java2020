package lesson210223;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MatrixWithCountDownLatch {
	
	public static void main(String[] args) {
		
		double[][] m = generate(100, 100_000);
		
		int numberOfThreads = Runtime.getRuntime().availableProcessors();
		numberOfThreads = Math.max(1, numberOfThreads/2);
		System.out.println("Threads: " + numberOfThreads);
		ExecutorService pool = Executors.newFixedThreadPool(numberOfThreads);
//		ExecutorService pool = Executors.newCachedThreadPool();

		long start = System.currentTimeMillis();
		
		CountDownLatch latch = new CountDownLatch(m.length);
		
		List<Future<Double>> tasks = new LinkedList<>();
		for (int i = 0; i < m.length; i++) {
			Calc task = new Calc(m[i], latch);
			tasks.add(pool.submit(task));
		}
		
		try {
			System.out.println("waiting for all rows to be calculated");
			latch.await();
			System.out.println("done!  collecting the results");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		double sum = 0;
		for (Future<Double> future : tasks) {
			try {
				Double result = future.get();
				sum += result;
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		long stop = System.currentTimeMillis();
		
		System.out.println(sum);
		System.out.println("Elapsed: " + (stop - start));
		
	}

	private static double[][] generate(int m, int n) {
		double[][] matrix = new double[m][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = Math.random();
			}
		}
		return matrix;
	}

}

class Calc implements Callable<Double> {
	
	private double[] row;
	private CountDownLatch latch;

	public Calc(double[] row, CountDownLatch latch) {
		this.row = row;
		this.latch = latch;
	}

	@Override
	public Double call() {
		try {
			double d = row[0];
			for (int k = 0; k < 1000; k++) {
				for (int i = 0; i < row.length; i++) {
					d += row[i];
				}
			}
			return d;
		} finally {
			latch.countDown();
		}
	}
	
}


