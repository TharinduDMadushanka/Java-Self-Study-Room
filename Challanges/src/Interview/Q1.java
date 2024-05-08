package Interview;

import java.util.Scanner;

/**
 * Check whether leap year or not
 */

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year:");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap year!");
        } else if (year % 100 == 0) {
            System.out.println("Not leap year!");
        } else if (year % 4 == 0) {
            System.out.println("Leap year!");
        } else {
            System.out.println("Not leap year!");
        }

    }
}
