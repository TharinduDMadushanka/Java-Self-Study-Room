package Conditional_Statement;

import java.util.Scanner;

/**
 * Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
 */
public class Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number between 1 and 7: ");
        int nb = input.nextInt();

        //String[] arr ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        String dayName = "";
        switch (nb) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
    }
}
