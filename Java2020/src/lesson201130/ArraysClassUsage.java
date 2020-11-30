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
			for(int i = 1; i <= a.length; i++) {
				newArray[i] = a[i-1]; 
				} 	
			} 
		// if the index is greater than the length of the array, I put the key in the end of the array and leave other values untouched
		else if(index > a.length){ 
				newArray[newArray.length - 1] = key; 
				for(int i = 0; i < a.length; i++) { 
					newArray[i] = a[i]; 
					} 
				} 
		// if the index is in between 1 and the length of the array, I put the key at the 'a[index]' and shift other values to the right
		else { 
			newArray[index] = key; 
			for(int i = 0; i < newArray.length; i++) { 
				if(i < index) newArray[i] = a[i]; 
				else if(i > index) newArray[i] = a[i-1]; 
				else continue; 
			}	
		}
		return newArray;	
	}
}
