package lesson210209.executors;

public class ExecutorsExamples2 {
	
	public static void main(String[] args) {
		
		double[][] m = generate(10, 10_000_000);
		
		long start = System.currentTimeMillis();
		
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			Summation task = new Summation(m[i]);
			task.run();
			sum += task.result();
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

class Summation implements Runnable {
	
	private double[] row;
	double d = 0;

	public Summation(double[] row) {
		this.row = row;
	}

	@Override
	public void run() {
		for (int k = 0; k < 100; k++) {
			for (int i = 0; i < row.length; i++) {
				d += row[i];
			}
		}
	}
	
	public double result() {
		return d;
	}
	
}


