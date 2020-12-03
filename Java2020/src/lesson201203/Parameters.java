package lesson201203;

import java.util.Arrays;

public class Parameters {
	
	static int[] a = {10, 20, 30};  // package level access, default

	public static void main(String[] args) {
		
		Utils.print();
		
		print(a);
		
		print(new int[] {9,8,7});
		
		System.out.println(Arrays.toString(a));
	}

	private static void print(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
		arr[0] = 100;
	}

}
