package lesson201130;

import java.util.Arrays;

public class MultiDimensionalArrays {
	
	public static void main(String[] args) {
		
		int[][] m = {
				{0, 1, 2},
				{3, 4 ,5},
				{6, 7, 8},
		};
		
		print(m);
		
		int[][] a = {
				{},
				{0},
				{0, 0},
				{0, 0, 0},
				{-1},
		};
		
		print(a);
		
		System.out.println(Arrays.toString(a[2]));
		a[3][2] = 999;
		System.out.println(a[3][2]);
		print(a);
		
		byte[][] b = new byte[1000000][2];
		byte[] b2 = new byte[2000000];
	}

	private static void print(int[][] m) {
		for (int[] v : m) {
			System.out.println(Arrays.toString(v));
		}
	}

}
