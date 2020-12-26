package sortArray;


import java.util.*;

public class sortOneMArray {
    public static Set<Integer> sortedSet(Integer[] arr) {
        List<Integer> mList = Arrays.asList(arr);
        Set<Integer> mSet = new TreeSet<>(mList);

        return mSet;
    }

    public static void main(String[] args) {
        int m = 1000000;
        Random random = new Random();
        Integer[] arr = new Integer[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        long startTime = System.currentTimeMillis();

        Set<Integer> set = sortedSet(arr);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }


}
