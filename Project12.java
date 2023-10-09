
import java.util.Scanner;
import java.util.ArrayList;

public class Project12 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        while (true) {
            System.out.println("Input integer (or any other character to stop input): ");
            if (myScan.hasNextInt()) {
                myList.add(myScan.nextInt());
            } else {
                break;
            }
        }
        
        System.out.println("Initial list is " + myList);
        
        myList.replaceAll(e -> e * e);
        myList.removeIf(e -> e < 100);
        myList.replaceAll(e -> (int)Math.sqrt(e));
        
        System.out.println("New list is " + myList);
    }
}
