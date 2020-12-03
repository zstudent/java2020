package lesson201130;

import java.util.Arrays;

public class ArraysClassUsage {
	
	public static void main(String[] args) {
		
		int[] a = {10, 4, 17, 0, -1, 34};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int index = Arrays.binarySearch(a, 10);
		System.out.println(index);
		
		System.out.println(a[index]);
		
		System.out.println(Arrays.binarySearch(a, 9));
		System.out.println(Arrays.binarySearch(a, -10));
		
		int[] b = insert(a, 9, 3);
		
		System.out.println(Arrays.toString(b));
		
	}

	private static int[] insert(int[] a, int key, int index) {
		int[] result = new int[a.length + 1];

		System.arraycopy(a, 0, result, 0, index);
		result[index] = key;
		System.arraycopy(a, index, result, index + 1, a.length - index);

		return result;
	}

}
