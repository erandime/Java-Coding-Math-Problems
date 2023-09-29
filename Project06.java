
import java.util.Scanner;

public class Project06 {

    public static int factorial(int num) {
        while (num != 0) {
            return num * factorial(num - 1);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
