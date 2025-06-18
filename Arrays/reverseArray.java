package Arrays;

import java.util.*;

public class reverseArray {
    public static void printMsg(String str) {
        System.out.println(str);
    }
    public static void printArray(int [] array) {
        for(int n : array) {
            System.out.print(n + " ");
        };
        printMsg("\n");
    }
    public static void reverseArr(int [] array) {
        int start = 0, end = array.length - 1;
        while(start<end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        printMsg("Enter array");
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        printMsg("Array before::");
        printArray(array);
        reverseArr(array);
        printMsg("Array after::");
        printArray(array);
        sc.close();
    }
}
