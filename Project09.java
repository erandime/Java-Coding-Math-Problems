package project09;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Project09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (true) {
            System.out.println("Enter an Integer(Enter any other character to stop input): ");
            if (sc.hasNextInt()) {
                Integer num = sc.nextInt();
                arr.add(num);
            } else {
                break;
            }
        }

        Iterator<Integer> it = arr.iterator();

        while (it.hasNext()) {
            Integer sel = it.next();
            if (sel >= 0 && sel <= 25) {
                it.remove();
            }
        }

        System.out.println("Numbers not in range 0-25 are: " + arr);
    }

}
