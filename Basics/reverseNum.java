import java.util.Scanner;

public class reverseNum {
    public static void main(String [] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = 0;
        while(x > 0) {
            res =  res * 10 + x%10;
            x /= 10;
        }
        System.out.println("Reverse Num:" + res);
        // System.out.println("Recursice Fun:" + recursiveFun(res));
        sc.close();
    }
}
