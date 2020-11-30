package lesson201130;

import java.util.Arrays;
import java.util.Random;

public class ArraysBinarySearch {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		long start = System.currentTimeMillis();
		int[] a = generate(100_000_000);
		long stop = System.currentTimeMillis();
		System.out.println("Create: Elapsed: " + (stop - start));

		start = System.currentTimeMillis();
		Arrays.sort(a);
		stop = System.currentTimeMillis();
		System.out.println("Sort: Elapsed: " + (stop - start));
		
		start = System.nanoTime();
		int index = Arrays.binarySearch(a, 998);
		stop = System.nanoTime();
		System.out.println("Search: Elapsed: " + (stop - start));
		
		System.out.println(index);
		
		// 1000  < 10  why?  2**10 = 1024
		// 1000000 < 20  why?  2**20 
		// 1000000000 < 30  why?  2**30
		// O(log2N)
		
		start = System.nanoTime();
		index = sequentialSearch(a, 998);
		stop = System.nanoTime();
		System.out.println("Search: Elapsed: " + (stop - start));
		
		
		
	}
	
	//  O(N)
	private static int sequentialSearch(int[] a, int key) {
		for (int j = 0; j < a.length; j++) {
			if (a[j] == key) {
				return j;
			}
		}
		return -1;
	}

	private static int[] generate(int n) {
		
		Random r = new Random();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = r.nextInt(1000);
		}
		return a;
	}

}
