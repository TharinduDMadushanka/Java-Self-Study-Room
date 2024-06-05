package Recursive_Methods;

import java.util.Scanner;

/**
 * Write a Java recursive method to calculate the factorial of a given positive integer
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a nb: ");
        int nb = input.nextInt();

        for (int i=nb;i<0;i--){
            System.out.print(nb+" x");
        }
    }
}
