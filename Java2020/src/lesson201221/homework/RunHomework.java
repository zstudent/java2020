package lesson201221.homework;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RunHomework {

    public static Random random = new Random();
    public static final int oneMillion = 1000000;
    public static final int high = oneMillion;
    public static final int low = -oneMillion;
    public static final int nanoTimeToSecondsFactor = 1000000000;

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        long start = System.nanoTime();

        for(int i = 0; i < oneMillion; i++) set.add(low + random.nextInt((high - low + 1)));

        long end = System.nanoTime();

        System.out.println("execution time = " + (end - start) / nanoTimeToSecondsFactor + " second(s)") ;
    }
}
