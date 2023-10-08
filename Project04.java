import java.util.Scanner;

public class Project04 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter length of side 01: ");
        double a = myObj.nextDouble();
        System.out.println("Enter length of side 01: ");
        double b = myObj.nextDouble();
        System.out.println("Enter length of side 01: ");
        double c = myObj.nextDouble();

        if (a <= 0 && b <= 0 && c <= 0) {
            System.out.println("Length cannot be zero.");
        } else if (a + b <= c && b + c <= a && a + c <= b) {
            System.out.println("Triangle doesn't exist");
        } else {
            double p = (a + b + c) / 2;
            double area = Math.sqrt((p - a) * (p - b) * (p - c));
            System.out.println("Perimeter of triangle is: " + p * 2);
            System.out.println("Area of triangle is: " + Math.round(area * 100) / 100d);
        }
    }
}
