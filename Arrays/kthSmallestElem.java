import java.util.Arrays;
import java.util.Scanner;

// This problem can be solved using two methods:
// 1. using priority queue ( To done after covering heap DS)
// 2. using quick sort algo 
public class kthSmallestElem {
    public static void swap(int[] a, int idx1, int idx2) {
        if (idx1<0 || idx2< 0 || idx1 >= a.length || idx2 >= a.length) return;
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    } 
    public static int partition(int[] a, int start, int end) {
        int pivot = a[end], i = start - 1;
        for (int j = start; j < end; j++) {
            if (a[j]<pivot) {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i + 1, end);
        return i + 1;
    }
    public static int quickSelect(int[] a, int start, int end, int k) {
        if (start>=end) return -1;
        int pIdx = partition(a, start, end);
        // System.out.println(pIdx + " "+ Arrays.toString(a));
        if (pIdx == k) return a[pIdx];
        else if (pIdx > k)  return quickSelect(a, start, pIdx - 1, k);
         return quickSelect(a, pIdx + 1, end, k);
    }
    public static int kSmallestNum(int[] a, int k) {
        if (k<0 || k>=a.length) return -1;
        return quickSelect(a, 0, a.length - 1, k);
    }
    public static void main(String[] args) {
        System.out.println("Enter space seprated numbers:::");
        Scanner sc = new Scanner(System.in);
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        System.out.println("Enter the value of K:::");
        int K = sc.nextInt();
        int result = kSmallestNum(a,K);
        // int result = k
        System.out.println("Kth smallest element:::" + result);
        sc.close();
    }
}