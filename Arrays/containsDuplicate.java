
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

/* Can be done using 2 methods:
 * 1. Using DS like maps, sets. (O(n)/O(n))
 * 2. Sort Arrays --> compare adjacents elements (O(nlogn)/O(1))
 */
public class containsDuplicate {
    public static boolean containsDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            Integer num = map.get(nums[i]);
            if (num != null) return true;
            else map.put(nums[i], 1);
        }
        return false;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array::\n");
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
        System.out.println(containsDuplicates(nums) ? "Contains duplicates" : "No duplicates found");
        sc.close();
    }
}