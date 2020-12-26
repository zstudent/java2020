package sortArray;


import java.util.*;

public class sortOneMArray {
    public static Integer[] sortedArray(Integer[] arr) {
        List<Integer> mList = Arrays.asList(arr);
        Set<Integer> mSet = new TreeSet<>(mList);
        int l = mSet.size();
        Integer[] sArr = mSet.toArray(new Integer[l]);
        return sArr;
    }

    public static void main(String[] args) {
        int m = 1000000;
        Random random = new Random();
        Integer[] arr = new Integer[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        long startTime = System.currentTimeMillis();

        Integer[] set = sortedArray(arr);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }


}
