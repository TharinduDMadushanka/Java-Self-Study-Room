package Conditional_Statement;

import java.util.Scanner;

/**
 * Write a Java program to get a number from the user and print whether it is positive or negative.
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a number: ");
        int nb = input.nextInt();

        if (nb%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
