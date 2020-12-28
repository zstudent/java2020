package homework;

import jdk.internal.util.xml.impl.Pair;

import java.sql.SQLOutput;
import java.util.*;

public class DuplicateSubstrings {
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

        char[] dna = generate(1_000_000);
//		System.out.println(Arrays.toString(dna));
        System.out.println("generated");
        long start = System.currentTimeMillis();
        Map<String, List<Integer>> dups = findDuplicatesUsingSort(dna, 50);
        long stop = System.currentTimeMillis();
        System.out.println("elapsed using sort = " + (stop - start));
        start = System.currentTimeMillis();
        dups = findDuplicatesUsingMap(dna, 50);
        stop = System.currentTimeMillis();
        System.out.println("elapsed using hashmap = " + (stop - start));
//		System.out.println(dups);

    }

    private static Map<String, List<Integer>> findDuplicatesUsingMap(char[] dna, int M) {

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

    private static Map<String, List<Integer>> findDuplicatesUsingSort(char[] dna, int M){
        Map<String, List<Integer>> dups = new HashMap<>();
        List<pair> subs = new ArrayList<>();
        for (int i = 0; i < dna.length - M; i++) {
            String substring = new String(Arrays.copyOfRange(dna, i, i + M));
            subs.add(new pair(substring,i));
        }
        Collections.sort(subs);
        String currString = subs.get(0).substring;
        List<Integer> currList = new ArrayList<>();
        for (int i = 0; i < subs.size(); i++) {
            pair currPair = subs.get(i);
            if(currPair.substring.equals(currString)){
                currList.add(currPair.index);
            }else{
                dups.put(currString, currList);
                currString = currPair.substring;
                currList = new ArrayList<>();
                currList.add(currPair.index);
            }
        }
        dups.put(currString, currList);
        return dups;
    }
    private static class pair implements  Comparable{
        private String substring;
        private int index;
        public pair(String substring, int index){
            this.substring = substring;
            this.index = index;
        }

        @Override
        public int compareTo(Object o) {
            return this.substring.compareTo(((pair)o).substring);
        }

        @Override //for testing
        public String toString(){
            return substring + " - " + index;
        }
    }
}
