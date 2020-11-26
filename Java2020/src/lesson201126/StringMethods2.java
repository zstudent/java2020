package lesson201126;

import java.util.Arrays;

public class StringMethods2 {
	
	public static void main(String[] args) {
		
		String s = "ExAmple";
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,5));
		System.out.println(s.substring(0,2));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.equals("Example"));
		System.out.println(s.equalsIgnoreCase("Example"));
		
		System.out.println(s.startsWith("Ex"));
		System.out.println(s.endsWith("le"));
		
		System.out.println(s.contains("mp"));

		s = "actgtgtatat";
		
		System.out.println(s.replace('t', 'u'));

		System.out.println("\t \n 123 ".trim());
		
		s = "this is a sentence";
		
		System.out.println(Arrays.toString(s.split(" ")));
		
		for (String word : s.split(" ")) {
			System.out.println(word);
		}
		
	}

}
