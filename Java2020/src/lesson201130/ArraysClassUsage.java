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
		int len = a.length;
		int[] res = new int[len+1];
		System.arraycopy(a, 0, res, 0, len);
		for(int i = len; i>index; i--){
			res[i] = res[i-1];
		}
		res[index] = key;
		return res;
	}

}
