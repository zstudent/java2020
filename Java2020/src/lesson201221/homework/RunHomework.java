package lesson201221.homework;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.*;

public class RunHomework {

    public static Random random = new Random();
    public static final int oneMillion = 1000000;
    public static final int high = oneMillion;
    public static final int low = -oneMillion;
    public static final int nanoTimeToSecondsFactor = 1000000000;

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        // Step 1 - create the array and fill it with random numbers
        for (int i = 0; i < oneMillion; i++) arr.add(low + random.nextInt((high - low + 1)));

        // Step 2 - put everything from the array to the TreeSet
        Set<Integer> set = new TreeSet<>(arr);

        long start = System.nanoTime();

        // put back everything from the set to the array, Then everything in the array will be sorted.
        arr.addAll(set);

        long end = System.nanoTime();

        // I am surprised that it executes in less than 1 second
        System.out.println("execution time = " + (end - start) / nanoTimeToSecondsFactor + " second(s)") ;
    }
}
