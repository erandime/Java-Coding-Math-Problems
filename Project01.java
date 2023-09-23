import java.util.Scanner;
/**
 *
 * @author erandi
 */
public class Project01 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);        
        System.out.println("Enter an Integer");
        int num = myObj.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }
        
    }
    
}
