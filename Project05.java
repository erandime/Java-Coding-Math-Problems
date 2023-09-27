import java.util.Scanner;

/**
 *
 * @author erandi
 */
public class Project05 {
    //method 01

    static int rev = 0;

    static int reverse(int num) {
        while (num != 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int num = sc.nextInt();

        //method2
        
        String str = num + "";
        char[] ch = str.toCharArray();
        int len = str.length();
        int i;
        for (i = (len - 1); i > -1; i--) {
            System.out.print(ch[i]);
        }

        System.out.println("Number in reverse order is " + reverse(num));
    }
}
