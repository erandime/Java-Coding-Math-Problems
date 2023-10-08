
import java.util.Scanner;

public class Project11 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Quadratic equation is of the form ax^2 + bx + c");
        System.out.println("a, b are called the coefficients of x2 and x respectively and c is called the constant.");
        System.out.println("a!=0 is a requirements for this program to work.");
        System.out.println("Enter value of a: ");
        double a = myScan.nextDouble();
        System.out.println("Enter value of b: ");
        double b = myScan.nextDouble();
        System.out.println("Enter value of c: ");
        double c = myScan.nextDouble();

        double x = Math.pow(b, 2) - 4 * a * c;
        double y = 2 * a;
        double z = Math.sqrt(x);

        if (a != 0) {
            if (x > 0) {
                double root1 = (-b + z) / y;
                double root2 = (-b - z) / y;
                System.out.println("Two real distinct roots: " + root1 + " and " + root2);
            } else if (x == 0) {
                double root = (-b + z) / y;
                System.out.println("Has only one root: " + root);
            } else {
                System.out.println("b^2 < 2ac , Roots are imaginary.!!");
                double rp = -b / y;
                double ip = Math.sqrt(-x) / y;
                System.out.println("The root1 is: " + rp + "+ i" + ip);
                System.out.println("The root2 is: " + rp + "- i" + ip);
            }
        } else {
            System.out.println("a == 0 , Not a quadratic equation!");
        }

    }
}
