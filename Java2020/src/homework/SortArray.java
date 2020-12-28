package homework;

import java.util.*;

public class SortArray {

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[1_000_000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100_000_000);
        }
        long startTime = System.currentTimeMillis();
        sortArr(arr);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime-startTime);
    }

    private static void sortArr(int[] arr){
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int index = 0;
        for (int n : set) {
            arr[index] = n;
            index++;
        }
    }
}