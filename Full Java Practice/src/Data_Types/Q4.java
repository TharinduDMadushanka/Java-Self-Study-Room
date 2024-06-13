package Data_Types;

import java.util.Scanner;

/**
 * Write a Java program to convert minutes into years and days.
 */
public class Q4 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        double minutes = input.nextDouble();

        double years = minutes / 525600;

        System.out.println("The years is " + years);
    }
}
