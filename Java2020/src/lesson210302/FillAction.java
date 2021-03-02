package lesson210302;

import java.util.Random;
import java.util.concurrent.RecursiveAction;

public class FillAction extends RecursiveAction {
	
	private static final int THRESHOLD = 1000;
	private int[] a;
	private int lo;
	private int hi;

	public FillAction(int[] a, int lo, int hi) {
		this.a = a;
		this.lo = lo;
		this.hi = hi;
	}

	@Override
	protected void compute() {
		if (hi - lo <= THRESHOLD) {
			Random r = new Random();
			for (int i = lo; i <= hi; i++) {
				a[i] = r.nextInt(100);
			}
		} else {
			int m = lo + (hi - lo) / 2;
			FillAction action1 = new FillAction(a, lo, m);
			FillAction action2 = new FillAction(a, m+1, hi);
			invokeAll(action1, action2);
		}
	}

}
