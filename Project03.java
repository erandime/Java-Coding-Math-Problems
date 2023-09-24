
import java.util.Scanner;

public class Project03 {

    public static void main(String[] args) {
        double cel , faren, kel;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celcius");
        cel = myObj.nextDouble();
        faren = cel * 9 / 5 + 32;
        faren = Math.round(faren*100)/100d;
        kel = cel + 273.15d;
        kel = Math.round(kel*100)/100d;
        
        System.out.println("The temperature is " + faren + "F");
        if (cel < -273.15) {
            System.out.println("Kelvin cannot be negative");
        } else {
            System.out.println("The temperature is " + kel + "K");
        }
    }

}
