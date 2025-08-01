// package Arrays;

import java.util.Scanner;
import java.util.*;

public class minAndMaxNum {
    private static void printMsg(String str) {
        System.out.println(str);
    }

    private static int max(int[] a) {
        if (a.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > max) max = num;
        }
        return max;
    }

    private static int min(int[] a) {
        if (a.length == 0) return 0;
        int max = Integer.MAX_VALUE;
        for (int num : a) {
            if (num < max) max = num;
        }
        return max;
    }

    private static void inputArray(int [] a) {
        Scanner sc = new Scanner(System.in);
        int[] temp = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
        a = temp;
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printMsg("Enter length of array: \n");
        int length = sc.nextInt();
        int[] array = new int[length];
        printMsg("Enter Array");
        // for (int i=0; i<length; i++) {
        //     array[i] = sc.nextInt();
        // }
        inputArray(array);
        printMsg("Min:" + min(array) + '\n' + "Max:" + max(array));
        sc.close();
    }
}
