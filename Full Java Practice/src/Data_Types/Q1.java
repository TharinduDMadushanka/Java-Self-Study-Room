package Data_Types;

import java.util.Scanner;

/**
 * Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
 */
public class Q1 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter temperature in F:");
        double temp= input.nextDouble();

        double result = (temp-32)*5/9;

        System.out.println("Celsius: " +result);
    }
}
