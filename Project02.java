import java.util.Scanner;

public class Project02 {

    public static void main(String[] args) {
        double product = 1.0;
        double num;
        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a Number OR enter 0 to end input: ");
            num = myObj.nextDouble();
            if(num == 0){break;}
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }
}
