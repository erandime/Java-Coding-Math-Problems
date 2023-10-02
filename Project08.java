package project08;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Project08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (true) {
            System.out.println("Enter an Integer(enter any other key to stop input): ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                arr.add(num);
            } else {
                break;
            }
        }
        Collections.sort(arr);
        System.out.println("Array after sorting is " + arr);
    }
}
