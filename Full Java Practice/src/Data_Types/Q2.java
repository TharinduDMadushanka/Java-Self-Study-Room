package Data_Types;

import java.util.Scanner;

/**
 * Write a Java program that reads a number in inches and converts it to meters.
 */
public class Q2 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter your measurement in inch:");
        double inch = input.nextDouble();

        double meter = inch / 2.54;

        System.out.println("Your measurement in inch is " + meter);
    }
}
