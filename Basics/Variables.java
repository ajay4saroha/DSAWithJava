import java.util.Scanner;
public class Variables{
    public static void printMsg (String msg) {
        System.out.println(msg);
    }

    public static void validation() {
        try {
            Scanner sc = new Scanner(System.in);
            String name;
            int age;
            printMsg("Enter your name:");
            name = sc.nextLine();
            printMsg("Enter your age:");
            age = sc.nextInt();
            printMsg("Name is: \t" + name + "\nAge is\t" + age);
            // System.out.println("Hello world");
            sc.close();
        } catch (Exception error) {
            System.out.println(error);
            validation();
        }
    }

    public static void main (String [] args) {
        validation();
    }
};