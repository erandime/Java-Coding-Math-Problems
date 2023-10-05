package project10;

import java.util.Scanner;

public class Project10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int num = scan.nextInt();
        int sum = 0;
        for (int d = num - 1; d > 1; d--) {
            if (num % d == 0) {
                sum++;
            }
        }

        if (sum == 0) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
