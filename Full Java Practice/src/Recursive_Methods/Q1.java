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

        int result =calFactorial(nb);

        System.out.println(result);
    }
    public static int calFactorial(int n){
        if (n==0){
            return 1;
        }

        return n*calFactorial(n-1);
    }
}
