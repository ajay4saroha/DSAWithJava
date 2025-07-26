public class searchInRotatedArray {
    public static int search(int[] a, int key) {
        int start = 0, end = a.length - 1;
        while(start<=end) {
            int mid = (start + end)/2;
            if (a[mid] == key) return mid;
            // Left half
            else if (a[start] < a[mid]) {
                if (a[mid]>key && a[start] <= key) end = mid -1;
                else start = mid + 1;
            }
            // Right half
            else {
                if (a[mid]<key && a[end]>=key) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,0,1,2};
        System.out.println(search(arr, 4));
    }
}
