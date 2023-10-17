
import java.util.Scanner;
import java.util.ArrayList;

public class Project12 {
    
    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        System.out.print("Input the number of integers/size of ArrayList ");
        int num = myScan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter integer number " + (i + 1) + " : ");
            myList.add(myScan.nextInt());
        }

        System.out.println("Initial list is " + myList);

        myList.replaceAll(e -> e * e);
        myList.removeIf(e -> e < 100);
        myList.replaceAll(e -> (int)Math.sqrt(e));

        System.out.println("New list is " + myList);
    }
}
