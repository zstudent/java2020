package lesson201228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FindDuplicateSubstringsOfLengthM {
	
	static char[] NUCLEOTIDES = {'A', 'C', 'G', 'T'};
	
	static char[] generate(int N) {
		Random r = new Random();
		char[] data = new char[N];
		for (int i = 0; i < data.length; i++) {
			data[i] = NUCLEOTIDES[r.nextInt(NUCLEOTIDES.length)];
		}
		return data;
	}
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		char[] dna = generate(10_000_000);
//		System.out.println(Arrays.toString(dna));
		System.out.println("generated");
		long start = System.currentTimeMillis();
		Map<String, List<Integer>> dups = findDuplicates(dna, 50);
		long stop = System.currentTimeMillis();
		System.out.println("elapsed = " + (stop - start));
		
//		System.out.println(dups);
		
	}

	private static Map<String, List<Integer>> findDuplicates(char[] dna, int M) {
		
		Map<String, List<Integer>> dups = new HashMap<String, List<Integer>>();
		
		for (int i = 0; i < dna.length - M; i++) {
			String substring = new String(Arrays.copyOfRange(dna, i, i + M));
			
			dups.computeIfAbsent(substring, k -> new ArrayList<Integer>()).add(i);
			
//			List<Integer> positions = dups.get(substring);
//			
//			if (positions == null) {
//				positions = new ArrayList<Integer>();
//				dups.put(substring, positions);
//			}
//			
//			positions.add(i);
		}
		
		return dups;
	}

}
