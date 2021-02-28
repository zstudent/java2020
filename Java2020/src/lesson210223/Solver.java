package lesson210223;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Solver {
	final int N;
	final float[][] data;
	final CyclicBarrier barrier;

	class Worker implements Runnable {
		int myRow;

		Worker(int row) {
			myRow = row;
		}

		public void run() {
			while (!done()) {
				processRow(myRow);

				try {
					barrier.await();  //  waiting for other threads to finish their jobs
				} catch (InterruptedException ex) {
					return;
				} catch (BrokenBarrierException ex) {
					return;
				}
			}
		}

		private void processRow(int myRow2) {
			// TODO Auto-generated method stub
			
		}

		private boolean done() {
			return false;
		}
	}

	public Solver(float[][] matrix) {
		data = matrix;
		N = matrix.length;
		Runnable barrierAction = new Runnable() {
			public void run() {
				mergeRows();
			}

			private void mergeRows() {
				// TODO Auto-generated method stub

			}
		};
		barrier = new CyclicBarrier(N, barrierAction);

		List<Thread> threads = new ArrayList<Thread>(N);
		for (int i = 0; i < N; i++) {
			Thread thread = new Thread(new Worker(i));
			threads.add(thread);
			thread.start();
		}

		// wait until done
		for (Thread thread : threads)
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}