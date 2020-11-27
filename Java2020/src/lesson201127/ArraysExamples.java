package lesson201127;

import java.util.Arrays;

public class ArraysExamples {

	static int x;
	static String s;
	static int[] d = new int[10];
	static Object[] o = new Object[1000]; // filled with nulls
	
	public static void main(String[] args) {
		
		
		int[] a;
		
		System.out.println(args);
		
		System.out.println(new Object());
		System.out.println(new Object().toString());
		
		a = new int[3];
		
		System.out.println(a);
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println(args.length);
		
		System.out.println(new boolean[0]);
		
		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.toString(a));
		
		int[] v1;
		int [] v2;
		int v3[];
		int v4 [];
		
		int[] b,c;
		
		int  t[], v;
		
		
	}

}
