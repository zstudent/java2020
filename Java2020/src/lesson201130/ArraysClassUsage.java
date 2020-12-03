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
		// increment the size of new array by one
		int[] newArray = new int[a.length + 1];
		// if the index is negative or equal to zero, I put the key in the beginning of the array and shift other values to the right 
		if(index <= 0) {
			newArray[0] = key;
			System.arraycopy(a, 0, newArray, 1, a.length);
		}
		// if the index is greater than the length of the array, I put the key in the end of the array and leave other values untouched
		else if(index >= a.length) {
			newArray[newArray.length - 1] = key;
			System.arraycopy(a, 0, newArray, 0, a.length);
		}
		// if the index is in between 1 and the length of the array, I put the key at the 'a[index]' and shift other values to the right
		else {
			System.arraycopy(a, 0, newArray, 0, index);
			newArray[index] = key;
			System.arraycopy(a, index, newArray, index + 1, a.length - index);
		}
		return newArray;
	}
		
		
			// if the index is greater than the length of the array, I put the key in the end of the array and leave other values untouched
			// if the index is in between 1 and the length of the array, I put the key at the 'a[index]' and shift other values to the right
			
}
