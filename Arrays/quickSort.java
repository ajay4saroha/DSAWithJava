import java.util.Arrays;
import java.util.Scanner;
public class quickSort {
    public static void swap(int[] a, int idx1, int idx2) {
        if (idx1<0 || idx2< 0 || idx1 >= a.length || idx2 >= a.length) return;
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    } 
    public static int partition(int[] a, int start, int end){
        int pivot = a[end];
        int i = start - 1;
        for (int k = start; k < end; k++) {
            if (a[k] <= pivot) {
                i++;
                swap(a, k, i);
            }
        }
        swap(a,i+1,end);
        return i + 1;
    }
    public static void sort(int[] a, int start, int end){
        if (start >= end) return;
        int pivot = partition(a, start, end);
        sort(a, start, pivot - 1);
        sort(a, pivot + 1, end);
    }
    public static void main(String[] args) {
        System.out.println("Enter the array:::\n");
        Scanner sc = new Scanner(System.in);
        int a[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}