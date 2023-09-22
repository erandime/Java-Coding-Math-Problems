/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaPractice;

import java.util.Scanner;

/**
 *
 * @author erandi
 */
public class Project01 {

    /**
     * @param args the command line arguments
     */
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
