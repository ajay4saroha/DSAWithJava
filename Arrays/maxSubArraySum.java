// package Arrays;

import java.util.*;

/*
 * USING KADANE ALGO:
 * 1. Have currentMax which store current maximum sum at current index.
 * 2. Have maxToFar which store maximum sum till now while traversing array.
 */
public class maxSubArraySum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer :: parseInt).toArray();
        System.out.println(Arrays.toString(array));
        int currentMax = array[0], maxToFar = array[0];
        for(int i=1;i<array.length;i++) {
            currentMax = Math.max(array[i], currentMax + array[i]);
            maxToFar = Math.max(maxToFar, currentMax);
        }
        System.out.println("Maximum sum::" + maxToFar);
        sc.close();
    }
}
