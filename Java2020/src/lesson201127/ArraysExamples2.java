package lesson201127;

import java.util.Arrays;

public class ArraysExamples2 {
	
	public static void main(String[] args) {
		
		String[] animals = { "cow", "cat", "dog"};
		
		String[]  mammals = animals;
		
		String[]  other = { "cow", "cat", "dog"};
		
		System.out.println(animals.equals(mammals));
		System.out.println(animals == mammals);
		System.out.println(animals.equals(other));
		System.out.println(Arrays.deepEquals(animals, other));
		
		String a = "Hello";
		String b = "Hello";
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

}
